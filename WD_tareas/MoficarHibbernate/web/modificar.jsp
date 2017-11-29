<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
    </head>
    <body>
        
        <s:form action="final.action">            
            <s:property value="id"/>            
            <s:textfield name="id" label="Usuario" value="%{usu}"/>
            <s:textfield name="password" label="Contraseña" value="%{pass}"/>
            <s:submit  value="Guardar"/>                    
        </s:form>
    </body>
</html>
