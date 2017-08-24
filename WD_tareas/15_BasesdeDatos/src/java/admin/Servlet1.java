/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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

//CONJUNTO DE RESULTADOS
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost/BaseLoginServlet", "root", "1234");//
            Statement s = db.createStatement(); //Permite hacer secuencias sql

            rs = s.executeQuery("SELECT Users.password FROM Users WHERE Users.id='Abraham1'");
            
        //PONEMOS EL WHILE PORQUE NO SABEMOS CUANTOS REGISTROS SE ADECUEN A LA CONSULTA    
            
        
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet hola1</title>");
        out.println("</head>");
        out.println("<body>");
        while (rs.next()) {
                out .println(rs.getString("Users.password"));    
            }
        out.println("<h2>Hola prro :3<h2>");
        out.println("</body>");
        out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
