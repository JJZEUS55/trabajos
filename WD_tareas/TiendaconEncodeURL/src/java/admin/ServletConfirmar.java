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
        
       HttpSession session = request.getSession();
       
       Enumeration enum1 = session.getAttributeNames();
       
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");            
            out.println("</head>");
            out.println("<body>");
            while(enum1.hasMoreElements()){
           String nombre =(String)enum1.nextElement();
           String at = (String)session.getAttribute(nombre);
           
           if(at != null){
               out.println("Camisa: " + nombre + " Costo :" + at);
           }
       }
       
            
            //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
//            out.println("<h2>Camisa 1: "+at1 +" <br/> Camisa 2: " + at2+"<h2>");
//            out.println("<h2>Camisa 3: " + at3+"</h3>");
            out.println("</body>");
            out.println("</html>");
    }

 

}

