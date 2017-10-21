<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head></head>
    <body>
        <h1>STRUTS 2 SESSION</h1>

        <h4>
            Bienvenido (OGNL):
            <s:iterator value="%{#session.username}">
                <s:property/>
            </s:iterator>
        </h4>

    </body>
</html>
