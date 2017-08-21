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
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cookie c1, c2;        
        double a, b, c, x1, x2;

        String sa = request.getParameter("ea");
        String sb = request.getParameter("eb");
        String sc = request.getParameter("ec");
        
        a = Integer.parseInt(sa);
        b = Integer.parseInt(sb);
        c = Integer.parseInt(sc);

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        
        String sx2 = Double.toString(x2);
        String sx1 = Double.toString(x1);
        
        c2 = new Cookie("c2", sx2);
        c1 = new Cookie("c1", sx1);
        
        c1.setMaxAge(365*24*60*1000);
        c2.setMaxAge(365*24*60*1000);
        
        response.addCookie(c1);
        response.addCookie(c2);
       

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"contenido\">\n"
                + "            <header>\n"
                + "                <h2>Solucion Ecuacion General</h2>\n"
                + "                <h3>Chicharronera</h3>\n"
                + "            </header>\n"
                + "            <div>\n"
                + "                 <h2>x1 = " + sx1 + "</h2>"
                + "                 <h2>x2 = " + x2 + "</h2>"        
                + "            </div>\n"
                + "        </div>");        
        out.println("</body>");
        out.println("</html>");
    }

}
