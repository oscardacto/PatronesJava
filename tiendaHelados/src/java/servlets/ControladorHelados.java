/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import cruds.CRUDHelados;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pojos.Helado;

/**
 *
 * @author Oscar Dacto
 */
@WebServlet(name = "ControladorHelados", urlPatterns = {"/ControladorHelados"})
public class ControladorHelados extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //static  CRUDHelados crudHelados = new CRUDHelados();
    CRUDHelados crudHelados ;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        crudHelados = new CRUDHelados();
        //VALIDAR DATO CORRESPONDIENTE AL OBJ
        int id = 0;
        if(!request.getParameter("id").equals("") && request.getParameter("id") != null){
            id = Integer.parseInt(request.getParameter("id"));
        }
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int category = Integer.parseInt(request.getParameter("category"));
        
        Enumeration<String> parameters = request.getParameterNames();
        parameters.nextElement();
        parameters.nextElement();
        parameters.nextElement();
        parameters.nextElement();
        parameters.nextElement();

        String operacion = parameters.nextElement();
        
        Helado helado = new Helado();
        helado.setId(id);
        helado.setName(name);
        helado.setDescription(description);
        helado.setPrice(price);
        helado.setCategory(category);
        
        if(operacion.equals("insertarhelado")){
            crudHelados.insertarHelado(helado);
        }
        if(operacion.equals("modificarhelado")){
            crudHelados.modificarHelado(helado);
        }
        if(operacion.equals("borrarhelado")){
            crudHelados.borrarHelado(helado.getId());
        }
        //System.out.println(" System.out.println-> response.sendRedirect(\"helados.jsp\")");
        response.sendRedirect("helados.jsp");
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorHelados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorHelados at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
