

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class covidregr
 */
@WebServlet("/covidregr")
public class covidregr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public covidregr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aadhaar = request.getParameter("aadhaar");
		String fullname = request.getParameter("fullname");
		String phone = request.getParameter("phone");
		String vaccine = request.getParameter("vaccine");
		String dose = request.getParameter("dose");
		String vaccinedate = request.getParameter("vaccinedate");
    
	    member mmr = new member(aadhaar,fullname,phone,vaccine,dose,vaccinedate);
	    regrd d = new regrd();
	    String result = d.insert(mmr);
	    response.getWriter().print(result);
	}
	
}