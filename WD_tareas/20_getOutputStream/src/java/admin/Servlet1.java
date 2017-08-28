/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge :v
 */
public class Servlet1 extends HttpServlet {

    //Este es un flujo binario
    //No mezclar flujos de texto con flujo binario
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Al navegador web se enviara una imagen 
        response.setContentType("image/jpeg");
        try {
            //Create an image 200 x 200     
            //Son memorias intermedias
            //Estas sirven para construir imagen en tiempo de ejecucion
            BufferedImage bufferedImage = new BufferedImage(200, 200,
                    BufferedImage.TYPE_INT_RGB);//Se usa modelo RGB por que es el modelo que se usa en los monitores y el monitor negro construye la imagen

            //Draw an oval  
            
            Graphics g = bufferedImage.getGraphics();
            g.setColor(Color.blue);
            g.fillOval(0, 0, 199, 199);

            //Free graphic resources  
            g.dispose();

            //Write the image as a jpg 
            //ImageIO manda al cliente esa imagen buffereada
            ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
