package com.jpa.dao.impl;

import com.jpa.dao.ActorDao;
import com.jpa.pojo.Actors;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class ActorDaoImpl implements ActorDao {

    //为了要与配置文件注入的bean产生联系，此处需要一下注解
    @PersistenceContext(name = "entityManagerFactory")
    private EntityManager entityManager;

    //增加
    @Override
    public void insertInfo(Actors actors) {
        entityManager.persist(actors);
    }
    /*
     * 删除;
     * 在HibernateJPA中，删除功能比较特殊，
     * 需要先通过主键查询，再通过查询结果删除数据
     */
    @Override
    public void deleteInfo(Actors actors) {
        Actors actors1 = selectById(actors.getId());
        entityManager.remove(actors1);
    }

    //修改
    @Override
    public void updateInfo(Actors actors) {
        entityManager.merge(actors);
    }

    //查询全部
    @Override
    public List<Actors> selectAll() {
        //用HQL（Hibernate的查询语言）
        Query query = entityManager.createQuery("from Actors");
        List<Actors> resultList = query.getResultList();
        return resultList;
    }

    //通过id查询
    @Override
    public Actors selectById(int id) {
        Actors actors = entityManager.find(Actors.class, id);
        return actors;
    }
}
