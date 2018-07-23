package user.web.servlet;
import ListObjects.Paper;

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

public class RejectedMattJohn extends HttpServlet {
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
		      
		     
		      String sql = "select *  from paper t1, review r1, review r2 where r1.recommendation = \"n\" AND r2.recommendation = \"n\" AND (r1.pcmemberID = (select pcmemberID from pcmember where name = \"matt\")) AND (r2.pcmemberID = (Select pcmemberID from pcmember where name = \"john\")) AND t1.paperid = r1.paperid and t1.paperid = r2.paperid;";
				 preparedStatement = connect.prepareStatement(sql); 
				rs = preparedStatement.executeQuery();
			List<Paper> list = new ArrayList<Paper>();  
		      while(rs.next())
		      {
		    	  Paper paper = new Paper(rs.getInt("paperid"), rs.getString("title"));
		    	  list.add(paper);
		    	  paper = null;
		      }
		      request.setAttribute("PaperList", list);
		    } catch (Exception e) {
		         System.out.println(e);
		    } finally {
		      close();
		    }
	      
		request.getRequestDispatcher("/Queryresult/RejectedMattJohn.jsp").forward(request, response);
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
