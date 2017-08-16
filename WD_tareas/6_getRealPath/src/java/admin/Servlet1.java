/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
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

//        IMPORTANTE
//        Request y Set de largo alcance
//        Pide Ruta virtual del servidor al que quiero accesar
//        Devuelve ruta real de archivos fisicos 
        //String ruta = request.getRealPath("/"); 
        
        ServletContext application = this.getServletContext();
        String ruta = application.getRealPath("/");

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");
        //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
        out.println("<h2>Hola prro :3" + ruta + "<h2>");
        out.println("</body>");
        out.println("</html>");
    }

}
