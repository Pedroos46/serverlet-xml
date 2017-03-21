package edu.fje.daw2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class GuardarXML extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String vista = "afegirProjectes.jsp";

      String nom = (request.getParameter("nom")).toString();
      String dataInici = (request.getParameter("dataInici")).toString();
      String dataFinal = (request.getParameter("dataFinal")).toString();
      String tascaInici = (request.getParameter("tascaInicial")).toString();

      String XMLPath = getServletContext().getRealPath("/WEB-INF/projectes.xml");

      try {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.newDocument();
        // root element

        Element rootElement = doc.createElement("Projectes");
        doc.appendChild(rootElement);

        Element nomProjecte = doc.createElement("Projecte");
        rootElement.appendChild(nomProjecte);

        //Elements projecte
        Element Xnom = doc.createElement("nom");
        Xnom.appendChild(doc.createTextNode(nom));
        nomProjecte.appendChild(Xnom);

        Element XdataInici = doc.createElement("Data-inici");
        XdataInici.appendChild(doc.createTextNode(dataInici));
        nomProjecte.appendChild(XdataInici);

        Element XdataFinal = doc.createElement("Data-final");
        XdataFinal.appendChild(doc.createTextNode(dataFinal));
        nomProjecte.appendChild(XdataFinal);

        Element Xtasques = doc.createElement("tasques");
        Xtasques.appendChild(doc.createTextNode(tascaInici));
        nomProjecte.appendChild(Xtasques);

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(XMLPath);

        System.out.println(XMLPath);

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.transform(source, result);

        // Output to console for testing
        StreamResult consoleResult = new StreamResult(System.out);
        transformer.transform(source, consoleResult);


      } catch (ParserConfigurationException e) {
        e.printStackTrace();
      } catch (TransformerConfigurationException e) {
        e.printStackTrace();
      } catch (TransformerException e) {
        e.printStackTrace();
      }

      RequestDispatcher rd = request.getRequestDispatcher(vista);
      rd.forward(request,response);

    }
}
