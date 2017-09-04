/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
        //HttpSession session = request.getSession();

        String[] ca1 = new String[6];

        ca1[0] = (String) request.getParameter("c1");
        ca1[1] = (String) request.getParameter("c2");
        ca1[2] = (String) request.getParameter("c3");
        ca1[3] = (String) request.getParameter("c4");
        ca1[4] = (String) request.getParameter("c5");
        ca1[5] = (String) request.getParameter("c6");

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");
            out.println("</head>");
            out.println("<body>");
            int i = 1;
           

            for (String index : ca1) {

                if (index != null) {
                    out.println("<h1>Has seleccionado camisa " + i + ": " + index + "</h1>");
                    //session.setAttribute("c"+i, index);
                    newcookie(index, i, response);
                }
                i++;

            }
            out.println("<form method=\"get\" action=\"ServletComprar\">\n"
                    + "            <input type=\"submit\" value=\"Agregar al Carrito\"/>\n"
                    + "            \n"
                    + "        </form>");           
            

            out.println("</body>");
            out.println("</html>");

        } catch (Exception e) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>No se pudo realizar la compra, Intente mas tarde<h2>");
            out.println("</body>");
            out.println("</html>");
        }

        /* TODO output your page here. You may use following sample code. */
    }

    private void newcookie(String val, int i, HttpServletResponse res) {

        Cookie galleta = new Cookie("c" + i, val);
        galleta.setMaxAge(60);
        res.addCookie(galleta);
        
    }

}
