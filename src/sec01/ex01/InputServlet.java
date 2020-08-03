package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "input", urlPatterns = { "/input" })
public class InputServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String[] checks = request.getParameterValues("subject");
		
		System.out.println(user_id);
		System.out.println(user_pw);
		
		for(String check : checks) {
			System.out.println(check);
		}
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

}
