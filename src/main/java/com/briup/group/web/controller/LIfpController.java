package com.briup.group.web.controller;

import com.briup.group.util.Message;
import com.briup.group.util.MessageUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LIfpController {
    @PostMapping
    public Message sdd(int stuID){
        MessageUtil.success();
    }
}
