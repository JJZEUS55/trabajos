<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!--//%@ significan directivas, modifican arquitectura del programa-->
<!--uri Permite asociar direcciones con recursos unicos-->
prefix 
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
    <body>
        <html:form method="get" action="Struts1">
            Usuario: <html:text property="name"/>
            Password: <html:password property="password"/>
            
            <html:submit value="Entrar"/>            
        </html:form>        
    </body>
</html:html>