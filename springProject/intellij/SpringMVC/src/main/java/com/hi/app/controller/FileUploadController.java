package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/report")
@Log4j2
public class FileUploadController {

    // get
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getReportForm(){
        log.info("GET /report");
        return "report/reportForm";
    }


    // post  : 파일 처리 -> 파일 이름확인, 사이즈, 
    // 파일 저장 : 저장 폴더 생성 -> 해당 경로(웹경로)->시스템 경로에 파일 저장
    // 이미지를 업로드 -> 웹페이지에서 확인


    //@RequestMapping(value = "/submit1", method = RequestMethod.POST)
    @PostMapping("/submit1")  // /report/submit1
    public String submit1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report")MultipartFile report,
            Model model,
            HttpServletRequest request
            ){

        log.info("POST /report/submit1");

        log.info("이름 : " + sname);
        log.info("학번 : " + snum);
        log.info("파일 이름 : " + report.getOriginalFilename() );
        log.info("파일 타입 : " + report.getContentType());
        log.info("파일 사이즈 : " + report.getSize());

        model.addAttribute("sname", sname);
        model.addAttribute("snum", snum);
        model.addAttribute("fileName", report.getOriginalFilename());

        
        // 업로드 경로
        // 서버 경로 /uploadfile/report -> webapp 폴더에 uploadfile 폴더 생성

        // 1. 저정하고자 하는 웹경로
        String uploadURI = "/uploadfile/report";
        // http://localhost:8080/uploadfile/report

        // 2. 웹 경로(report 폴더) 기반으로 시스템 경로를 획득 : HttpServletRequest 필요
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirRealPath);
        // 3. 저장 ( 파일의 이름을 변경해서 저장 가능 )
        // 4. view 저장 이미지 이름을 공유


        return "report/submit1";
    }





}
