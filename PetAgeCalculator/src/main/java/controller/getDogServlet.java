package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DogAgeCalculator;


/**
 * Servlet implementation class getDogServlet
 */
@WebServlet("/getDogServlet")
public class getDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String petAge = request.getParameter("userPetAge");
		
		DogAgeCalculator petCalc = new DogAgeCalculator(Integer.parseInt(petAge));
		
		request.setAttribute("dogAgeFetch", petCalc);
		
		getServletContext().getRequestDispatcher("/dogResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(petCalc.toString());
		writer.close();
	}

}
