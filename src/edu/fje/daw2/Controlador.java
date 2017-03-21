package edu.fje.daw2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controlador extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String operacio = request.getParameter("op");
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        String vista="error.jsp";

        int res=0;
        switch (operacio){
            case "suma":
                res=n1+n2;
                vista="suma.jsp";
                break;
            case "resta":
                res=n1-n2;
                vista="resta.jsp";
                break;
        }
        Resultat r = new Resultat(operacio, res);

        RequestDispatcher rd = request.getRequestDispatcher(vista);
        request.setAttribute("resultat",r);
        rd.forward(request,response);

    }
}
