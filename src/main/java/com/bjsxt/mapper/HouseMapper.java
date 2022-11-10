package com.bjsxt.mapper;

import com.bjsxt.pojo.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface HouseMapper {

    @Select("select *  from  tb_house")
     List<House>  selectAll();

    @Update("update tb_house  set h_sell=1  where h_id=#{hid}")
     int   update(@Param("hid") int hid);

    @Insert("insert into tb_house values(default,#{hTitle},#{hPrice},0,#{hImage},#{hEstate})")
      int   insert(House  house);

}
