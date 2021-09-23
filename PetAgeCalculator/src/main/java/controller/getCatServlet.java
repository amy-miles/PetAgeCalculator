package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CatAgeCalculator;


/**
 * Servlet implementation class getCatServlet
 */
@WebServlet("/getCatServlet")
public class getCatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String petAge = request.getParameter("userPetAge");
		
		CatAgeCalculator petCalc = new CatAgeCalculator(Integer.parseInt(petAge));
		
		request.setAttribute("catAgeFetch", petCalc);
		
		getServletContext().getRequestDispatcher("/catResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(petCalc.toString());
		writer.close();
	}

}
