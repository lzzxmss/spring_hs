package com.bjsxt.service;

import com.bjsxt.pojo.House;

import java.util.List;

public interface HouseService {

    List<House>  findAll();

    int  edit(int hid);

    int  save(House house);

}
