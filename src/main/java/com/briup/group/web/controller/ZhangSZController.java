package com.briup.group.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZhangSZController {
    @GetMapping("/zsz")
    public String zsz(){

          return "添加信息成功";
      }
}
