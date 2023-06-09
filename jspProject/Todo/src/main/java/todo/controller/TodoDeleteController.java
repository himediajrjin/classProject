package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.service.TodoDeleteService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {

	TodoDeleteService deleteService;

	public TodoDeleteController() {
		this.deleteService = TodoDeleteService.getInstance();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("TodoDeleteController...doPost()...");

		// 회원의 로그인 여부를 확인 후 비로그인상태 -> 로그인페이지로 이동
		HttpSession session = request.getSession();

		// 1. session 이 새로만들어진 세션이 아니고 세션에 로그인 정보를 가지고 있다면 => 로그인 상태
		// 리디렉션 => 로그인 페이지
		// 2. 새로 만들어진 세션이거나 세션에 로그인 정보가 없다면
		if (session.isNew() || session.getAttribute("loginInfo") == null) {

			System.out.println("로그인 상태가 아니다!!!");
			// 로그인페이지로 리디렉션
			response.sendRedirect("/app/login");

			return;
		}

		// 사용자로부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);

		// 서비스로 no 전달 -> 삭제 처리
		int result = deleteService.delete(no);
		// 결과
		if (result > 0) {
			System.out.println(no + "번 할일이 삭제 되었습니다.");
		} else {
			System.out.println("삭제실패...");
		}

		// redirect ( list )
		response.sendRedirect("list");

	}

}
