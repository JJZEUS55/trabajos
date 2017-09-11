package paquete;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FilterServlet implements Filter {
private ServletContext context;
@Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        String id=request.getParameter("id");
        context.log("User:"+id);// Se registra a la bitacora, se escribe en la bitacora el identificador del usuario
        System.out.println("User:"+id);
        chain.doFilter(req, res);// Si hay mas dofilter ejecutara los siguientes, es necesario para que se llamen a todos los dofilter
    }
  
    
// Es donde se inicializan los recursos que se van a utilizar
@Override
    public void init(FilterConfig config) throws ServletException {
    context=config.getServletContext();
    }
 
    
// En el destroy se liberan los recursos
@Override
    public void destroy() {
    }
}