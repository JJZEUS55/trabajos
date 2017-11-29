<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:iterator value="lista">
            <s:url var="url" action="Modificar.action">
                <s:param name="id">
                    <s:property value="idUser"/>
                </s:param>
                <s:param name="usuario">
                    <s:property value="id"/>
                </s:param>
                <s:param name="password">
                    <s:property value="password"/>
                </s:param>                
                <s:property value="id"/><a href="<s:property value="#url"/>">Modificar</a><br/><br/>
            </s:url>
        </s:iterator>   
    </body>
</html>
