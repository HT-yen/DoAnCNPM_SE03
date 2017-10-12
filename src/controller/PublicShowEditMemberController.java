package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PublicShowEditMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PublicShowEditMemberController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
         RequestDispatcher rd = request.getRequestDispatcher("/edit_member.jsp");
         rd.forward(request, response);
	}

}
