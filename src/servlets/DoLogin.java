package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin") //annotation
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    //아래 객체들(request, response)은 사용자가 부를 때마다 항상 생김
    //멤버 변수를 조심해야해..
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// perform business logic 
		// ctrl+shift+o 누르면 알아서 출력
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		
		htmlResponse+= "<h2> Your name is : " + username + "<br/>";
		htmlResponse+= "Your password is : " + password + "<h2>";
		htmlResponse+= "</html>";
				
		out.println(htmlResponse);
		
	}  	// 우리가 직접 구현해야 하는 부분 

}
