package servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testbateau")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	   /**
	    * @see HttpServlet#HttpServlet()
	    */
	   public Servlet() {
	       super();
	       // TODO Auto-generated constructor stub
	   }

	    /**
	     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        LocalTime heure = LocalTime.now();
	    	List<String> bateaux = BateauRepo.findAll();
	        response.getWriter().append("Le bateau a coulé à " ).append(heure.toString())
	        .append("<br>Liste des bateaux : ")
	        .append(bateaux.toString());
	    }

	    /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        doGet(request, response);
	    }

}
