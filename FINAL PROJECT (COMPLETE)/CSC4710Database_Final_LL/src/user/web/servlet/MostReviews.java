package user.web.servlet;
import ListObjects.PCMember;

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
import java.util.ArrayList;
import java.util.Date;

/**
 * Servlet implementation class initialize
 */

public class MostReviews extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		      
		     
		      String sql = "Select name, pcmember.email from pcmember, (select pcmemberID, count(*) As reviews from review group by pcmemberID) t2 where pcmember.pcmemberID = t2.pcmemberID and reviews = (Select Max(reviews) from (select pcmemberID, count(*) As reviews from review group by pcmemberID) t3)";
				 preparedStatement = connect.prepareStatement(sql); 
				rs = preparedStatement.executeQuery();
			List<PCMember> list = new ArrayList<PCMember>();  
		      while(rs.next())
		      {
		    	  PCMember pcmember = new PCMember(rs.getString("name"), rs.getString("email"));
		    	  list.add(pcmember);
		    	  pcmember = null;
		      }
		      request.setAttribute("PCMemberList", list);
		    } catch (Exception e) {
		         System.out.println(e);
		    } finally {
		      close();
		    }
	      
		request.getRequestDispatcher("/Queryresult/ReviewMostPaper.jsp").forward(request, response);
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
