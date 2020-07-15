package controlleur;

import entite.DynamiqueOperation;
import entite.Forfait;
import org.json.simple.parser.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "servletmango")
public class ServletMango extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DynamiqueOperation operation = new DynamiqueOperation();
        ArrayList<Forfait> list = new ArrayList<Forfait>();
        try {
            list = operation.list_forfait(1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("listMango",list);
        this.getServletContext().getRequestDispatcher("/forfaitMango.jsp").forward(request, response);
    }
}
