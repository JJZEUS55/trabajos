package admin;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FilterServlet1 implements Filter {
    //Implements es para interfaz
    //si una clase usa interfaz Esta comprometiendose a implementar los metodos de la interfaz

    
    //Estas clases son el ciclo d vida de Filter
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;//Como no lo tiene en los parametros se debe hacer un casteo         
        
        String ip = request.getRemoteAddr();//Se recupera la direccion ip del cliente que se usa para loggear
        
        System.out.println("IP:"+ip + ", TIEMPO:"+ new Date().toString());        
        
        chain.doFilter(req, res);
    }
    //Se usa cuando usamos un recurso
    public void init(FilterConfig config) throws ServletException {
        String parametroprueba = config.getInitParameter("parametroprueba");
        System.out.println("Parametro de prueba: " + parametroprueba);
    }
    public void destroy() {
    }
}