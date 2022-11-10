package com.bjsxt.controller;

import com.bjsxt.pojo.House;
import com.bjsxt.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService  houseService;

    @RequestMapping("/list")
    public  String  findAll(Model  model){

        List<House> list = houseService.findAll();

        model.addAttribute("list",list);
        return "show";
    }

    @RequestMapping("/edit")
    @ResponseBody
    public  int  edit(int hid){

        return houseService.edit(hid);
    }

    @RequestMapping("/save")
    public  String     save(MultipartFile photo, House house, HttpServletRequest request) throws IOException {

        String realPath = request.getServletContext().getRealPath("/imgs");
        File file=new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }

        //添加图片
        photo.transferTo(new File(file,photo.getOriginalFilename()));

        //添加房子
        house.setHImage("/imgs/"+photo.getOriginalFilename());
        int i = houseService.save(house);

        return "redirect:/house/list";
    }



}
