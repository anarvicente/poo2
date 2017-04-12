

import cafeteria.dominio.Bebida;
import cafeteria.dominio.Expresso;
import cafeteria.dominio.Cappuccino;
import cafeteria.dominio.adicionais.Creme;
import cafeteria.dominio.adicionais.Chocolate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FestaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            Bebida bebida = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cafeteria</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cafeteria!</h1>");

            String tipo_bebida = request.getParameter("tipo_bebida");
            if (tipo_bebida.equalsIgnoreCase("Cappuccino")) {
                bebida = new Cappuccino();
            } else if (tipo_bebida.equalsIgnoreCase("Expresso")) {
                bebida = new Expresso();
            }

            if (request.getParameterMap() != null) {
                if (request.getParameterMap().containsKey("Creme")) {
                    bebida = new Creme(bebida);
                    
                }
                if (request.getParameterMap().containsKey("Chocolate")) {
                    bebida = new Chocolate(bebida);
                }
                
            }

            out.println("Valor Total " + bebida.valor());
            out.println("</body>");
            out.println("</html>");

            /* TODO output your page here. You may use following sample code.
            
            Festa festa = new FestaCrianca();
            System.out.println(festa.getDescription()
                    + " $ " + festa.cost()
            );

            Festa cappuccino = new FestaCrianca();  // custo 
            cappuccino = new Creme(cappuccino);
            cappuccino = new Creme(cappuccino);
            cappuccino = new Chocolate(cappuccino);

            System.out.println(cappuccino.getDescription() + " $ " + cappuccino.cost());
             */
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Cafeteria Servlet";
    }

}
