package com.jpa.service;

import com.jpa.pojo.Actors;

import java.util.List;

public interface ActorService {
    //增加
    void addInfo(Actors actors);
    //删除
    void delInfo(int id);
    //修改
    void updInfo(Actors actors);
    //查询
    List<Actors> showAll();
    //通过id查询
    Actors showById(int id);
}
