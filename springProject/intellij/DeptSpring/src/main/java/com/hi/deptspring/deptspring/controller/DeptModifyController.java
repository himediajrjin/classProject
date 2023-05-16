package com.hi.deptspring.deptspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/modify")
public class DeptModifyController {

    @GetMapping
    public String getModifyForm(){
        return "dept/modifyForm";
    }

    @PostMapping
    public String modify(){
        return "redirect:/dept/list";
    }
}
