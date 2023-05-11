package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo/regist")
@Log4j2
public class TodoRegistController {

    // get : form 페이지로 응답
    public String getRegistForm(){

        log.info("GET /todo/regist ");

        return "/WEB-INF/views/todo/registForm.jsp";
        // /WEB-INF/views/todo/regist.jsp
    }


    // post : redirect -> /todo/list , view 필요가 없다!!!


}
