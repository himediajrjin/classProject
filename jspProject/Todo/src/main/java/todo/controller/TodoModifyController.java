package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정 폼 : 이전에 입력했던 데이터가 화면에 출력
		
		// no 값을 받고
		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고
		// requst 속성에 결과 데이터를 저장
		// view 지정
		// forward
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 수정 Form에서 전달받은 데이터를 서비스에 요청 : update
		// 결과 받고
		// redirect 처리
		
	}

}
