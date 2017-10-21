<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inicio De Sesion</h1>
        <%@ page import="java.sql.*" %>
        <!--SCOPE SIRVE PARA DONDE LLEGA LOS ATRIBUTOS-->
        <jsp:useBean id="manejador" scope="session" class="com.escom.BasedeDatos.DB"></jsp:useBean>
        <s:form action="/Usuario/Session">
            <s:textfield name="username" label="Usuario"/>
            <br/>
            <s:password name="password" label="Contraseña"/>
            <br/>
            <s:submit/>     
            <%
            ResultSet rs = null;
            manejador.setConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/BaseLoginServletJSP");
            rs = manejador.executeQuery("SELECT id, password FROM users WHERE Users.id=''");
            if (rs.next()) {
                out.println(rs.getString("Users.password"));
            }
            manejador.closeConnection();
        %>
        </s:form>
    </body>
</html>
