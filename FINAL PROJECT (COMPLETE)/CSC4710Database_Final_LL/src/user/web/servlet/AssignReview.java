package user.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.domain.User;
import user.service.UserService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Servlet implementation class initialize
 */

public class AssignReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		      
		     String pcmember1 = request.getParameter("pcmember1");
		     String pcmember2 = request.getParameter("pcmember2");
		     String pcmember3 = request.getParameter("pcmember3");
		     String title = request.getParameter("title");
		     
		     preparedStatement = connect
		              .prepareStatement("insert into  review(pcmemberID, paperid) values ((select pcmemberID from pcmember where email = ?), (select paperid from paper where title = ?) )");
		          preparedStatement.setString(1, pcmember1);
		          preparedStatement.setString(2, title);
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, pcmember2);
		          preparedStatement.setString(2, title);
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, pcmember3);
		          preparedStatement.setString(2, title);
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
