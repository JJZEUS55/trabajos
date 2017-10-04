/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge :v
 */
public class Servlet_Muestra extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/tiendita", "root", "1234");
            Statement s = db.createStatement();
            
            rs = s.executeQuery("SELECT * FROM camisa");
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hola1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h2>Seleccione las que va a comprar</h2>");
            out.println("<form method=\"get\" action=\"ServletConfirmar\">");
            out.println("<table>");
            out.println("<tr>\n"
                    + "                    <th>ID</th>\n"
                    + "                    <th>NOMBRE</th>\n"
                    + "                    <th>CANTIDAD</th>\n"
                    + "</tr>");
            
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("idCamisa") + "</td>"); 
                out.println("<td>" + rs.getString("nombre") + "</td>");
                out.println("<td>" + rs.getString("costo") + "</td>");
                out.println("<td>" + rs.getString("cantidad") + "</td>");   
                out.println("<td>" + "<input type=\"checkbox\" name='"+ rs.getString("idCamisa")+"' value='"+rs.getString("costo")+"'/>" + "</td>");               
                //out.println("<td>" + "<input type=\"checkbox\" name='"+rs.getString("idCamisa")+"'/>" + "</td>");  
                out.println("</tr>");
            }            
            out.println("</table>");
            out.println("<input type=\"submit\" value=\"Comprar\"/>");
            out.println("</form>");
            //out.println("<h2>Hola prro :3<h2>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* TODO output your page here. You may use following sample code. */
    }
    
}
