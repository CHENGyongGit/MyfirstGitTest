package com.jpa.dao;

import com.jpa.pojo.Actors;

import java.util.List;

public interface ActorDao {
    //增加
    void insertInfo(Actors actors);
    //删除
    void deleteInfo(Actors actors);
    //修改
    void updateInfo(Actors actors);
    //查询
    List<Actors> selectAll();
    //通过主键查询
    Actors selectById(int id);
}
