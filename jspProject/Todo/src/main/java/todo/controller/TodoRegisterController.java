package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		// todo 입력 폼 화면 출력
		System.out.println("TodoRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
		
		
	}

	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		// 입력폼에서 전달한 데이터를 받아서 처리
		
		
	}

}
