package user.web.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertPC
 */

public class InsertReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

		private static Connection connect = null;
		 private static Statement statement = null;
		 private static PreparedStatement preparedStatement = null;
		 private static ResultSet rs = null;
	       
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
			      
			     String paperName = request.getParameter("paperName");
			     String date = request.getParameter("date");
			     String recommendation = request.getParameter("rec");
			     String description = request.getParameter("review");
			     String revName = request.getParameter("reviewerName");
			     
			     preparedStatement = connect.prepareStatement("select paperid from paper where title = (?);");
			     preparedStatement.setString(1, paperName);
			     rs = preparedStatement.executeQuery();
			     rs.next();
			     String paperid = rs.getString("paperid");

			   

			     preparedStatement = connect.prepareStatement("select pcmemberID from pcmember where name = (?);");
			     preparedStatement.setString(1, revName);
			     rs = preparedStatement.executeQuery();
			     rs.next();
			     String pcmemberid = rs.getString("pcmemberID");
		     
			     
			     
			     preparedStatement = connect
			              .prepareStatement("update review set subDate=?, description=?, recommendation =? where paperid=? and pcmemberid=?");
			          preparedStatement.setString(1, date);
			          preparedStatement.setString(2, description);
			          preparedStatement.setString(3, recommendation);
			          preparedStatement.setString(4, paperid);
			          preparedStatement.setString(5, pcmemberid);
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
		      if(rs != null)
		      {
		    	  rs.close();
		      }
		    } catch (Exception e) {

		    }
		  }

	}