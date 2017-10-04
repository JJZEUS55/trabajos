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
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        HttpSession session = request.getSession();
        
        Enumeration enum1 = request.getParameterNames();
        
        String confirmar = response.encodeURL("ServletConfirmar");
        
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>VER SELECCION</h1>");
            int total = 0;
            while(enum1.hasMoreElements()){
                String nombre = (String)enum1.nextElement();
                String [] valores = request.getParameterValues(nombre);
                //session.setAttribute(nombre, valores);                
                if(valores != null){
                    for(int i = 0; i<valores.length; i++){
                        session.setAttribute(nombre, valores[i]);
                        out.println(nombre + " :" + valores[i]);                        
                        out.println("<br/>");
                        total = total + Integer.parseInt(valores[i]);  
                        
                    }
                       
                }
            }
            
            out.println("<h3>Costo total es de: " + total +"</h3>");
            out.println("<a href='"+ confirmar +"'>Confirmar compra</a>");
            //response.sendRedirect("ServletConfirmar");
            
            //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
            
            out.println("</body>");
            out.println("</html>");
    }

 

}

