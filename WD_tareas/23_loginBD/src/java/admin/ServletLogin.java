package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String tipo = "";
        String id = request.getParameter("id1");
        String password = request.getParameter("password");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("userName", id);
        response.setContentType("text/html;charset=UTF-8");
        LoginBean lb = new LoginBean();
        // check to see if this user/password combination are valid
        if (lb.validateUser(id, password)) {
            switch (lb.getTipo()) {
                case "1":
                    out.println("<h1>Hola MAESTRO</h1>");
                    break;
                case "2":
                    out.println("<h1>Hola Alumno</h1>");
                    break;
                case "3":
                    out.println("<h1>Hola Administrador</h1>");
                    break;
                    default:;
            }

        } else // username/password not validated
        {
            response.sendRedirect("fail");
        }
    }
}
