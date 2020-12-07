package com.jpa.service.impl;

import com.jpa.dao.ActorDao;
import com.jpa.pojo.Actors;
import com.jpa.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;

    //增加
    @Override
    @Transactional
    public void addInfo(Actors actors) {
        actorDao.insertInfo(actors);
    }

    //删除
    @Override
    @Transactional
    public void delInfo(int id) {
        actorDao.deleteInfo("");
    }

    //修改
    @Override
    @Transactional
    public void updInfo(Actors actors) {
        actorDao.updateInfo(actors);
    }

    //查询全部
    @Override
    public List<Actors> showAll() {
        return actorDao.selectAll();
    }

    //通过id查询
    @Override
    public Actors showById(int id) {
        return actorDao.selectById(id);
    }
}
