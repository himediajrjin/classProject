package com.hi.board.service;

import com.hi.board.domain.RequestModifyRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class BoardModifyService {

    public int modifyBoardDTO(
            RequestModifyRequest modifyRequest,
            HttpServletRequest request
    ){

        // 파일 저장 : 파일이 존재하면 저장
        if(modifyRequest.getFile() != null && modifyRequest.getFile().getSize()>0 ){

            // 웹 경로
            String uri = "/uploadfile/board";
            // 실제경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            // 새로운 파일 이름
            String newFilename = UUID.randomUUID().toString()+modifyRequest.getFile().getOriginalFilename();
            // 저장
            File newFile = new File(realPath, newFilename);
            try {
                modifyRequest.getFile().transferTo(newFile);
                // filename 속성에 새로운 파일 이름을 저장
                modifyRequest.setFilename(newFilename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            
        } else {
            // filename 속성에 이전 업로드된 파일 이름을 저장
        }
        
        // BoaerMapper update 요청
        return 1;
    }

}
