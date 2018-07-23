package user.web.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertPC
 */

public class DeleteAuthor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

		private static Connection connect = null;
		 private static Statement statement = null;
		 private static PreparedStatement preparedStatement = null;
	       
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doPost(request,response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			try{
			      // This will load the MySQL driver, each DB has its own driver
			      Class.forName("com.mysql.jdbc.Driver");
			      // Setup the connection with the DB
			      connect = DriverManager
			          .getConnection("jdbc:mysql://localHost:3306/sampledb?"
				              + "user=root&password=Lenglee96");
			      
			     String name = request.getParameter("AuthorName");

			     
			     preparedStatement = connect
			              .prepareStatement("Delete from author where name = (?)");
			          preparedStatement.setString(1, name);
			          preparedStatement.executeUpdate();
			          
			    } catch (Exception e) {
			         System.out.println(e);
			    } finally {
			      close();
			    }
		      
			request.getRequestDispatcher("/jsps/body.jsp").forward(request, response);
		}
		private static void close() {
		    try {

		      if (statement != null) {
		        statement.close();
		      }

		      if (connect != null) {
		        connect.close();
		      }
		    } catch (Exception e) {

		    }
		  }

	}