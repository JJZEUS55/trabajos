/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admi;

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
        Cookie galleta2 = new Cookie("id2", "12");//ID y valor
        Cookie galleta3 = new Cookie("id3", "13");
        //Periodo de tiempo
        galleta2.setMaxAge(365 * 24 * 60 * 1000);//Dias horas del dia minutos (1000 es el segundo) ESte durara un aÑo
        //Añadir coockies
        response.addCookie(galleta2);
        response.addCookie(galleta3);

        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");
        //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
        out.println("<h2>Hola prro con galletas :3<h2>");
        out.println("</body>");
        out.println("</html>");
    }

}
