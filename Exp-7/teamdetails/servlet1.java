/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/servlet1"})
public class servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String[] teams = {"Team A", "Team B", "Team C", "Team D"};

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sports Teams List</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Sports Teams List</h1>");
        out.println("<ul>");
        for (String team : teams) {
            out.println("<li><a href='/WebApplication1/RosterServlet?team=" + team + "'>" + team + "</a></li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}

       /* out.println("<form >");
        out.println("enter the team name");
        out.println("<input type='text'></input>");
        out.println("<input type='submit'>");
        out.println("</form>");*/
    
