package com.hi.board.controller;

import com.hi.board.service.BoardReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/modify")
public class BoardModifyController {

    @Autowired
    private BoardReadService readService;

    @GetMapping
    public void modifyForm(
        @RequestParam("bno") int bno,
        Model model
    ){
        // bno 전달 받고 View 로 BoardDTO 객체 전달
        model.addAttribute("board", readService.getBoardDTO(bno));
    }

    @PostMapping
    public String modify(){
        // 사용자 입력한 BoardDTO Service 전달 -> update
        return "redirect:/board/list";
    }
}
