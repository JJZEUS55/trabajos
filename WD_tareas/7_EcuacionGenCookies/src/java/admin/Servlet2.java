/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge :v
 */
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Cookie [] cs = request.getCookies();
       

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"contenido\">\n"
                + "            <header>\n"
                + "                <h2>Solucion Ecuacion General Con galletas</h2>\n"
                + "                <h3>Chicharronera</h3>\n"
                + "            </header>\n"
                + "            <div>\n"
                + "                 <h2>x1 = " + cs[0].getValue() + "</h2>"
                + "                 <h2>x2 = " + cs[1].getValue() + "</h2>"        
                + "            </div>\n"
                + "        </div>"); 
                
        out.println("</body>");
        out.println("</html>");
    }

}
