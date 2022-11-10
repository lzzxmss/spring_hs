package com.bjsxt.mapper;

import com.bjsxt.pojo.Estate;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EstateMapper {

    @Select("select *  from  tb_estate")
    List<Estate>  selectAll();

}
