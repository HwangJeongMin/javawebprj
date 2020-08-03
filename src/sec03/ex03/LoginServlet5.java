package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login5", urlPatterns = { "/login5" })
public class LoginServlet5 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String address = request.getParameter("address");
		
		System.out.println("���̵� : "+ user_id);
		System.out.println("��й�ȣ : "+ user_pw);
		
		String data = "<html>";
		data += "<body>";
		data += "���̵� : "+ user_id;
		data += "<br />";
		data += "��й�ȣ : "+ user_pw;
		data += "<br />";
		data += "�ּ� : "+ address;
		data += "</body>";
		data += "</html>";
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

}