package list_book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S
 */
@WebServlet("/S")
public class S extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book> books = new ArrayList();
		books.add(new Book("name1", 12.0, "asdf"));
		books.add(new Book("name2", 13.0, "asdf"));
		books.add(new Book("name3", 14.0, "asdf"));
		
		
		// add list to args and redirect to JSP
		request.setAttribute("books", books);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/t.jsp");
        dispatcher.forward(request, response); 
	}
}
