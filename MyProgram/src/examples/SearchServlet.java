package examples;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			String name=request.getParameter("name");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
			//response.setContentType("text/html");
			//PrintWriter out=response.getWriter();
		
			PreparedStatement pstatement=con.prepareStatement("select *from registrations where name=?");
			pstatement.setString(1, name);
			ResultSet rs=pstatement.executeQuery();
			rs.next();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			out.println("<html><body>");
			out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getString(5)+""+rs.getString(6));
		    out.println("</body></html>");
		    pstatement.close();
		    con.close();
			out.close();
			
			
		}
		catch(Exception e) {
			
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
