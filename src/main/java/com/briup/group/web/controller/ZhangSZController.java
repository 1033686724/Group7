package com.briup.group.web.controller;

import com.briup.group.util.Message;
import com.briup.group.util.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZhangSZController {
    @GetMapping("/add")
    public Message add(){

          return MessageUtil.success("添加信息成功");
      }
    public Message delete(){

        return MessageUtil.success("删除信息成功");
    }
}
