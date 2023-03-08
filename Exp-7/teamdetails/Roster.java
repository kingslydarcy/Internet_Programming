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


@WebServlet(urlPatterns = {"/RosterServlet"})
public class Roster extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     private String[] teamAroster = {"Player 1", "Player 2", "Player 3", "Player 4"};
    private String[] teamBroster = {"Player 5", "Player 6", "Player 7", "Player 8"};
    private String[] teamCroster = {"Player 9", "Player 10", "Player 11", "Player 12"};
    private String[] teamDroster = {"Player 13", "Player 14", "Player 15", "Player 16"};

     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Team Roster</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Team Roster</h1>");
        String team = request.getParameter("team");
        if (team.equals("Team A")) {
            out.println("<h2>Team A Roster</h2>");
            out.println("<ul>");
            for (String player : teamAroster) {
                out.println("<li>" + player + "</li>");
            }
            out.println("</ul>");
        } else if (team.equals("Team B")) {
            out.println("<h2>Team B Roster</h2>");
            out.println("<ul>");
            for (String player : teamBroster) {
                out.println("<li>" + player + "</li>");
            }
            out.println("</ul>");
        } else if (team.equals("Team C")) {
            out.println("<h2>Team C Roster</h2>");
            out.println("<ul>");
            for (String player : teamCroster) {
                out.println("<li>" + player + "</li>");
            }
            out.println("</ul>");
        } else if (team.equals("Team D")) {
            out.println("<h2>Team D Roster</h2>");
            out.println("<ul>");
            for (String player : teamDroster) {
                out.println("<li>" + player + "</li>");
            }
            out.println("</ul");
        }
    }
}
