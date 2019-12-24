package com.briup.group.web.controller;

import com.briup.group.util.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XwhController {
    @PostMapping("/xwh")
    public Message play(){
        Message message=new Message();
        message.setTime(System.currentTimeMillis());
        message.setStatus(0);
        message.setMessage("xwh");
        message.setData("有点意思");
        return message;
    }

}