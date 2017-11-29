<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios Totales</title>
    </head>
    <body>
        <s:iterator value="lista">
            <s:url action="modificar.action" var="url">
                <s:param name="id">
                    <s:property value="idUser"/>
                </s:param>
                <s:property value="id"/><a href="<s:property value="#url"/>">Modificar</a><br/>                 
            </s:url>
        </s:iterator>
    </body>
</html>
