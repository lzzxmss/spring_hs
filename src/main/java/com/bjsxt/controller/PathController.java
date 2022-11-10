package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathController {

    @RequestMapping("/{path}")
    public   String  getPath(@PathVariable String path){

        return  path;
    }

    @RequestMapping("/favicon.ico")
    @ResponseBody
    public   String  icon(){

        return  "";
    }

}
