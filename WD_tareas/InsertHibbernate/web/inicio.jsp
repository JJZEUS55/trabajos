<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="Insertar">
            <s:textfield name="usuario" key="Usuario: "/>
            <s:textfield name="password" key="Contraseña: "/>
            <s:submit value="Guardar"/>      
            <s:actionmessage/>
        </s:form>
    </body>
</html>
