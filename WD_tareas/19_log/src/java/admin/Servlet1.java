package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        
                
        //this.getServletContext().log("HOLA MUNDO DESDE EL LOG");
        try (PrintWriter out = response.getWriter()) {
            //Debe montarse en tomcat o en algun servidor para que funcione
            //Se guarda como archivo de texto en el servidor
            //Se usa por que la base de datos consume mas recursos que este
            ServletContext application = this.getServletContext();
            application.log("Se estan intentando logear");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet18</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet18 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
    }

}
}