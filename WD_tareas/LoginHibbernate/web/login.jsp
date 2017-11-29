<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="Login">
            <s:textfield key="Usuario: " name="usuario"/>
            <s:textfield key="Password: " name="password"/>
            <s:submit value="Iniciar"/>
        </s:form>
    </body>
</html>
