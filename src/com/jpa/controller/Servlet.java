package com.jpa.controller;

import com.jpa.dao.ActorDao;
import com.jpa.pojo.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Servlet {

    @Autowired
    private ActorDao actorDao;

    @Transactional
    @Rollback(false)
    @RequestMapping("testInsert")
    public String testInsert(Model module){
        Actors actors = new Actors();
        actors.setName("彭于晏");
        actors.setSex("男");
        actorDao.insertInfo(actors);
        module.addAttribute("list",actors);
        System.out.println("增加成功！");
        return "index.jsp";
    }

    @Transactional
    @Rollback(false)
    @RequestMapping("testDelete")
    public String testDelete(){
        Actors act = new Actors();
        act.setId(4);
        actorDao.deleteInfo(act);
        System.out.println("删除成功...");
        return "showInfo";
    }
    @Transactional
    @Rollback(false)
    @RequestMapping("testUpdate")
    public String testUpdate(){
        Actors emp = new Actors();
        emp.setId(1);
        emp.setName("刘亦菲");
        emp.setSex("女");
        actorDao.updateInfo(emp);
        System.out.println("改好了...");
        return "showInfo";
    }

    @RequestMapping("showInfo")
    public void showInfo(){
        List<Actors> list = actorDao.selectAll();
        for (Actors employee : list) {
            System.out.println(employee);
        }
    }

}
