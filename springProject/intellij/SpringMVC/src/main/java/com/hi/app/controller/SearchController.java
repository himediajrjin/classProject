package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class SearchController {

    @RequestMapping("/search/search1")
    public String search1(
            Model model,
            String keyword,
            @RequestParam(value = "tno", defaultValue = "0") String tno
            ){

        log.info("/search/search1 ...");
        log.info("keyword : " + keyword);
        log.info("tno : " + tno);

        // 사용자가 전달하는 파라미터를 받는 방법
        // 1. 매개변수에 변수를 정의 : 변수의 이름은 파라미터의 이름으로 정의
        // 2. @RequestParam() : 필수항목, 기본값을 정의
        
        
        model.addAttribute("result", keyword+tno);

        return "search/search1";
    }
}
