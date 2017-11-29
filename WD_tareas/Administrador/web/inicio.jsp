<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <br/>
        <h1>Inicio de Sesion</h1>
        <br/>
        <s:form action="Login">
            <s:textfield key="Usuario: " name="usuario"/>
            <s:textfield key="Contraseña: " name="password"/>
            <s:submit value="Entrar"/>
        </s:form>
    </body>
</html>
