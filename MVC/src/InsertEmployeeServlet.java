

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDaoImpl;
import data.Employee;

/**
 * Servlet implementation class InsertEmployee
 */
@WebServlet("/InsertEmployee")
public class InsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeeDaoImpl empdao=new EmployeeDaoImpl();
		Employee emp=new Employee();
		String empid=request.getParameter("empid");
		String empname=request.getParameter("empname");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		String email=request.getParameter("email");
		int count=empdao.insertEmployee(emp);
		if(count==1) {
			RequestDispatcher rd=request.getRequestDispatcher("insertsuccess.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("insertfailure.jsp");
			rd.forward(request, response);
			
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
