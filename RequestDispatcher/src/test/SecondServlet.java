package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name=request.getParameter("name");
			String dept=request.getParameter("dept");
			String desg=request.getParameter("desg");
			String company=(String) request.getAttribute("company");
			String mobile=(String) request.getAttribute("mobile");
			String email=(String) request.getAttribute("email");
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<html><body>");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
				String query="insert into registrations values (?,?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, name);
				pst.setString(2, dept);
				pst.setString(3, desg);
				pst.setString(4, company);
				pst.setString(5, mobile);
				pst.setString(6, email);
				int count=pst.executeUpdate();
				if(count==1)
					out.println("<b>Record Inserted Successfully...</br>");
				else
					out.println("<b>Record Not Inserted....</br>");
				out.println("</body></html>");
				pst.close();
				con.close();
				out.close();
		}
		catch(Exception e) {
			System.out.println(e);
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
