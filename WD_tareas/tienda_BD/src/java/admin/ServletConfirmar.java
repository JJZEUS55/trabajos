/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge :v
 */
public class ServletConfirmar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                      
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Enumeration num = request.getParameterNames();
        int precio = 0;
      
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            while(num.hasMoreElements()){   
                String nombre = (String) num.nextElement();
                
                String valores[] = request.getParameterValues(nombre);
                
                if(valores != null){
                    for(int i = 0; i<valores.length; i++){
                         out.println(nombre + ": " + valores[i] + "</br>");
                         precio = precio + Integer.parseInt(valores[i]);
                    }
                    
                }
                
            }
            out.println("<h3>Precio total: " + precio + "</h3>");
            //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
            //out.println("<h2>Hola prro :3<h2>");
            out.println("</body>");
            out.println("</html>");
    }

 

}

