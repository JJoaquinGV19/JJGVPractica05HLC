/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bosque
 */
public class ServletDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Personas> x =  Consulta.devuelveConsulta();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /* TODO output your page here. You may use following sample code. */
 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletNombre</title>");
            out.println("<link rel=\"stylesheet\" href=\"estilos.css\" type=\"text/css\"><link>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 class=\"titulo\">Personajes Filtrados</h1>");
            out.println("<ul>");
            out.println("<li><a href=\"index.jsp\">Pagina Principal</a></li>");    
            out.println("<li><a href=\"ServletNombre\">Personajes</a></li>");    
            out.println("<li><a href=\"ServletDatos\">Personajes Filtrados</a></li>");      
            out.println("</ul>");
            
            out.println("<form action=\"ServletCabecera\" method=\"post\" id=\"FormNombrePost\" name=\"FormNombrePost\" >");
            out.println("<label for=\"nombre\">Filtrado por: </label>");
            out.println("<select name=\"tipo\" id=\"tipo\">");
            out.println("<option>Nombre</option>");
            out.println("<option>Altura</option>");
            out.println("<option>Nacimiento</option>");
            out.println("</select>");
            
               
            out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\"/>");
            out.println("<input type=\"submit\" id=\"enviar\" name=\"enviar\" value=\"enviar\" />");
            out.println("</form>");
            
             // Para meter la dobles comillas en una cadesa se precede del caracter \
            out.println("</body>");
            out.println("</html>");
            /* */
            out.close(); 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
