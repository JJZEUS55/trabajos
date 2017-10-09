package com.escom;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HolaTag extends TagSupport {

    private String mensaje = "Mundo";

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int doEndTag() {
        try {
            pageContext.getOut().println("Shupala " + mensaje);
        } catch (IOException e) {
        }   
        return EVAL_PAGE;
    }
}
