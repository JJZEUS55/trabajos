package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String id= request.getParameter("id");
        String password= request.getParameter("password");        
        HttpSession sesion=request.getSession();
        sesion.setAttribute("userName",id);
        response.setContentType("text/html;charset=UTF-8");
        LoginBean lb = new LoginBean();
        // check to see if this user/password combination are valid
        if(lb.validateUser(id,password))
        {
            switch(lb.TipeUser(id))
            {
                case "1":
                    response.sendRedirect("welcome1");
                    break;
                case "2":
                    response.sendRedirect("welcome2");
                    break;
                case "3":
                    response.sendRedirect("welcome3");
                    break;
            }
        
        }
        else	// username/password not validated
        {
        response.sendRedirect("fail");
        }
    }
}
