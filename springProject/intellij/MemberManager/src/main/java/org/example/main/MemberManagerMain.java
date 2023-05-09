package org.example.main;

import org.example.dao.MemberDao;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;

public class MemberManagerMain {

    public static void main(String[] args) {
        // 사용자 메뉴 입력
    }

    // 입력 메소드
    static void newCommand(){

        MemberRegisterService registerService =
                new MemberRegisterService(new MemberDao());

    }
    
    // 변경 메소드
    static void changeCommand(){

        ChangePasswordService passwordService =
                new ChangePasswordService(new MemberDao());

    }
    

}
