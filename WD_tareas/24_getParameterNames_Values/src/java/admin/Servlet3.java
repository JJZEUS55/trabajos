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
public class Servlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Enumeration enum1 = request.getParameterNames();//Regresa todos los parametros que tengamos de la parte html

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");

        //El while sirve para poder obtener todos los elementos hasta que termine
        while (enum1.hasMoreElements()) {
            String nombre = (String) enum1.nextElement();

            String valores[] = request.getParameterValues(nombre);//Si algun elemento html tiene mas de un valor se almacenan aqui

            //Revisamos que no haya valores vacios
            if (valores != null) {
                for (int i = 0; i < valores.length; i++) {
                    out.println(nombre + " (" + i + "): " + valores[i]);
                }
            }
        }

        //out.println("<h1>Servlet hola1 at " + request.getContextPath() + "</h1>");
        //out.println("<h2>Hola prro :3<h2>");
        out.println("</body>");
        out.println("</html>");
    }

}
