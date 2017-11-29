<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form>
            <s:textfield name="id" value="%{id}" key="Usuario: "/>
            <s:textfield name="password" value="%{password}" key="Contraseña: "/>
            <s:submit value="Guardar"/>
        </s:form>
    </body>
</html>
