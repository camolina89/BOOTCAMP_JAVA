package cl.empresa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Instanciamos un escritor
		response.setContentType("text/html; charset=UTF-8");
		
		//request - get parameter
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		String lenguaje = request.getParameter("lenguaje");
		String homeTown = request.getParameter("home");
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>Welcome, "+name+" "+lastName+"</h1>");
		
		pw.write("<h2>Your Favorite language is: "+lenguaje+"</h2>");
		
		pw.write("<h3>Your Hometown is: "+homeTown+"</h3>");
		
		// http://localhost:8080/SimpleProject/Home?name=Cris&lastName=Molina&lenguaje=PHP&home=Chillan
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
