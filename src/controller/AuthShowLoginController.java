package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthShowLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthShowLoginController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
         RequestDispatcher rd = request.getRequestDispatcher("/auth/login.jsp");
         rd.forward(request, response);
	}

}
