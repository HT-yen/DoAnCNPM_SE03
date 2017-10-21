package library;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LibraryAuth {
	
      public static boolean CheckLogin(HttpServletRequest request ,HttpServletResponse response) throws IOException{
    	//kiểm tra đã đăng nhập chưa
    	//true : login roi
      	//fail : chua
          HttpSession session = request.getSession();
          if(session.getAttribute("sobjUser")==null){//chưa đăng nhâp 
         	 //chuyen huong
         	 response.sendRedirect(request.getContextPath()+"/auth/show-login");
         	 return false;
          }
          
          return true;
      
      }
      
}
