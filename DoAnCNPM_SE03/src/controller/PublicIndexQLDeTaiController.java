package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PublicIndexQLDeTaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PublicIndexQLDeTaiController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		 request.setCharacterEncoding("UTF-8");
		 response.setCharacterEncoding("UTF-8");
		 response.setContentType("text/html");
		 
		 //hiển thị danh sách đề tài có phân trang
		
         RequestDispatcher rd = request.getRequestDispatcher("/quanly_detai.jsp");
         rd.forward(request, response);
	}

}
