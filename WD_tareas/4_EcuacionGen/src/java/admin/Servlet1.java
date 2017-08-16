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
        String ca = request.getParameter("a");
        String cb = request.getParameter("b");
        String cc = request.getParameter("c");

        double res = 0, res2 = 0, a, b, c;

        HttpSession session = request.getSession();

        session.setAttribute("a", ca);
        session.setAttribute("b", cb);
        session.setAttribute("c", cc);

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet 1</title>\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <link rel=\"stylesheet\" href=\"css_admin/hojacss.css\">");
        out.println("</head>");
        out.println("<body>");
        //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
        //out.println("<h2>Hola prro mundo 1:3<h2>");
        
        out.println("<h2>Calculo de la Ecuacion: </h2>");
        out.println("<p>a = " + ca);
        out.println("<br/>");
        out.println("b = " + cb);
        out.println("<br/>");
        out.println("c = " + cc);
        out.println("<br/>");
        out.println("</p>");

        a = Integer.parseInt(ca);
        b = Integer.parseInt(cb);
        c = Integer.parseInt(cc);
        res = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        res2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        out.println("<h3>x1 = " + res + "</h3>");
        out.println("<br/>");
        out.println("<h3>x2 = " + res2 + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }

}
