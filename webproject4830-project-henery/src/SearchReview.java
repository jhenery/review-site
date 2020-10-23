

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
 * Servlet implementation class SearchReview
 */
@WebServlet("/SearchReview")
public class SearchReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchReview() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyword = request.getParameter("keyword");
	    List<Show> showList = UtilDBHenery1023.listShows(keyword);
	    response.getWriter().println("<a href=/webproject4830-project-henery/simpleSearchHB.html>Search Reviews	</a>");
	    response.getWriter().println("<br> <a href=/webproject4830-project-henery/simpleInsertHB.html>Create Review	</a>");
	    response.getWriter().println("<br> <a href=/webproject4830-project-henery/ListReview>All Reviews</a> <br> <br>");
	    response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Search Result";
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
	            "transitional//en\">\n"; //
	      out.println(docType + //
	            "<html>\n" + //
	            "<head><title>" + title + "</title></head>\n" + //
	            "<body bgcolor=\"#f0f0f0\">\n" + //
	            "<h1 align=\"center\">" + title + "</h1>\n");
	    if(showList.isEmpty())
	    {
	    	response.getWriter().println("NO RESULTS");
	    }
	    else 
	    { 
	    	for (Iterator<?> iterator = showList.iterator(); iterator.hasNext();) {
		            Show show = (Show) iterator.next();
		            out.println(show.toString());
		            response.getWriter().println("----------------------------------------------------- <br>");
		    }
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
