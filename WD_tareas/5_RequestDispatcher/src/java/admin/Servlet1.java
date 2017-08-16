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
        
//      IMPORTANTE  RequestDispatcher
//      Puedes pasar parametros o atributos a la sigueinte pagina
//      Podemos guardar con el setAtribbute para la siguiente pagina
//      A diferencia del send redirect que solo te redirige sencillamente a la otra pagina

        RequestDispatcher o = request.getRequestDispatcher("/Servlet2");//Ruta relativa
        o.forward(request, response);
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Hola prro :3<h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
