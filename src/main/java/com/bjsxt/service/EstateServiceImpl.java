package com.bjsxt.service;

import com.bjsxt.mapper.EstateMapper;
import com.bjsxt.pojo.Estate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateServiceImpl implements EstateService {

    @Autowired
    private EstateMapper estateMapper;

    @Override
    public List<Estate> findAll() {
        return estateMapper.selectAll();
    }
}
