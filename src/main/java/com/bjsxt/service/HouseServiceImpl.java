package com.bjsxt.service;

import com.bjsxt.mapper.HouseMapper;
import com.bjsxt.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;
    @Override
    public List<House> findAll() {
        return houseMapper.selectAll();
    }

    @Override
    public int edit(int hid) {
        return houseMapper.update(hid);
    }

    @Override
    public int save(House house) {
        return houseMapper.insert(house);
    }
}
