package user.web.servlet;

import ListObjects.SingleAuthor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class insertPC
 */

public class SearchFirst extends HttpServlet {
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
			      
			     String author = request.getParameter("author");

			     preparedStatement = connect
			              .prepareStatement("select t1.paperid, title from paper t1, writes where email = (select email from author where name = (?)) AND contNum = 1 AND t1.paperid = writes.paperid;");
			      	      	preparedStatement.setString(1, author);
					rs = preparedStatement.executeQuery();
					
				List<SingleAuthor> list = new ArrayList<SingleAuthor>();  
			      while(rs.next())
			      {
			    	  SingleAuthor sAuthor = new SingleAuthor(rs.getInt("paperid"), rs.getString("title"));
			    	  list.add(sAuthor);
			    	  sAuthor = null;
			      }
			      request.setAttribute("SingleList", list);
			    } catch (Exception e) {
			         System.out.println(e);
			    } finally {
			      close();
			    }
		      
			request.getRequestDispatcher("/jsps/searchFirstAuthor.jsp").forward(request, response);
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
		      if(preparedStatement != null)
		      {
		    	  preparedStatement.close();
		      }
		    } catch (Exception e) {

		    }
		  }

	}
