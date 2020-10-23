

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Show;
import util.UtilDBHenery1023;

/**
 * Servlet implementation class ListReview
 */
@WebServlet("/ListReview")
public class ListReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListReview() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<a href=/webproject4830-project-henery/simpleSearchHB.html>Search Reviews	</a>");
	    response.getWriter().println("<br> <a href=/webproject4830-project-henery/simpleInsertHB.html>Create Review	</a>");
	    response.getWriter().println("<br> <a href=/webproject4830-project-henery/ListReview>All Reviews</a> <br> <br>");
	    List<Show> showList = UtilDBHenery1023.listShows();
	    if(showList.isEmpty())
	    {
	    	response.getWriter().println("NO REVIEWS");
	    }
	    else 
	    { 
	    	for (Iterator<?> iterator = showList.iterator(); iterator.hasNext();) {
		            Show show = (Show) iterator.next();
		            response.getWriter().println(show.toString());
		            response.getWriter().println("----------------------------------------------------- <br>");
		    }
	    }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
