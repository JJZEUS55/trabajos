<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>

<!--CREACMOS ETIQUETAS PERSONALIZADAS :3 IMPORTANTE
EL TLD ES UN ARCHIVO XML, SIRVE PARA HACER EL MAPEADO ENTRE ETIQUETA PERSONALIZADA Y LA FUNCIONALIDAD
SE METE EN EL WEB INF PARA NO PODER ACCEDERLO DESDE EL NAVEGADOR-->
<%@ taglib uri="/WEB-INF/libp.tld" prefix="PrefijoHola" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Untitled Document</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>

    <body>
        <PrefijoHola:Hola mensaje="EXAMEN PROXIMO JUEVES 15"/>
    </body>
</html>
