package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
		
import model.User;
import model.UserDAO;

/**
 * Servlet implementation class userDetailServelet
 */
@WebServlet("/userDetailServelet")
public class userDetailServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public userDetailServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = null;				
		List<User> user;
		try {
			user = UserDAO.getUser();
			request.setAttribute("user", user);
		} catch (Exception e) {
			e.printStackTrace();
			message = e.getMessage();
		}

		if (message != null)
			request.setAttribute("message", message);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Data.jsp");
		dispatcher.forward(request, response);	
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
