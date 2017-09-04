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
public class ServletComprar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Cookie[] galleta = request.getCookies();
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<br/>");
        out.println("<div class='comprar'>");
        out.println("<ul>\n"
                + "                    <li>\n"
                + "                        <img src=\"ropa/camisa1.jpg\" alt=\"camisa 1\">\n"
                + "                        <br/>\n"
                + "                        <h2>Camisa 1 <span>$ 500</span></h2><input type=\"checkbox\" name=\"c1\" id=\"cam1\" value=\"500\"/>\n"
                + "                    </li>");

        out.println("</div>");

//        for (int i = 0; i < galleta.length; i++) {
//            out.println("El nombre de la galleta es:" + galleta[i].getName() + "\n");
//            out.println("<br/>");
//            out.println("El valor de la galleta es:" + galleta[i].getValue() + "\n");
//            out.println("<br/>");
//            out.println("<br/>");
//
//        }
        //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
        out.println("<h2>Hola prro :3<h2>");
        out.println("</body>");
        out.println("</html>");
    }

}
