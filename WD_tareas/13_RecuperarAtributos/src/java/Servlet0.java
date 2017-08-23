/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge :v
 */
public class Servlet0 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

//IMPORTANTE        
//CONCATE EL JSESSION ID    IDENTIFICADOR DE LA SESSION
//SIRVE POR SI EL USUARIO TIENE BLOQUEADAS LAS GALLETAS
        String encodeURL1 = response.encodeURL("Servlet1");
        String encodeURL2 = response.encodeURL("Servlet2");

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<a href=\"" + encodeURL1 + "\">Servlet1</a>");
        out.println("<br/>");
        out.println("<a href=\"" + encodeURL2 + "\">Servlet2</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
