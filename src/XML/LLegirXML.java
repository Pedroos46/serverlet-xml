//package XML;
//
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class LLegirXML extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String operacio = request.getParameter("op");
//
//        String nom = (request.getParameter("nom")).toString();
//        String dataInici= (request.getParameter("dataInici")).toString();
//        String dataFinal = (request.getParameter("dataFinal")).toString();
//        String vista="error.jsp";
//
//
//        RequestDispatcher rd = request.getRequestDispatcher(vista);
//        rd.forward(request,response);
//
//    }
//}
