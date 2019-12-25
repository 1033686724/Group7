package com.briup.group.web.controller;

import com.briup.group.util.Message;
import com.briup.group.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Xwh")
public class XwhController {
    @PostMapping("/add")
    @ApiImplicitParam(name = "message",dataType = "String",value = "xwh的",paramType ="Query",required = true)
    public Message add(){
        return MessageUtil.success("添加成功");
    }
    @PostMapping("/del")
    public Message del(){
        return MessageUtil.success("删除成功");
    }
    @PostMapping("/change")
    public Message change(){
        return MessageUtil.success("更改成功");
    }
    @PostMapping("/search")
    public Message search(){
        return MessageUtil.success("查询成功");
    }

}