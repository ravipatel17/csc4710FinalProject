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

public class initialize extends HttpServlet {
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
		      System.out.println("Select a table and then print out its content.");
		      // This will load the MySQL driver, each DB has its own driver
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://localHost:3306/sampledb?"
			              + "user=root&password=root");

		        

		      // Statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      statement.executeUpdate("DROP TABLE IF EXISTS review;");
		      statement.executeUpdate("DROP TABLE IF EXISTS pcmember;");
		      statement.executeUpdate("DROP TABLE IF EXISTS writes;");
		      statement.executeUpdate("DROP TABLE IF EXISTS author;");
		      statement.executeUpdate("DROP TABLE IF EXISTS paper;");
		      
		     
		      String sqlstmt = "Create table paper( paperid integer Auto_Increment, title varchar(50), abstract varchar(250), pdf varchar(100), primary key (paperid));"; 
		      statement.executeUpdate(sqlstmt); 
		      
		      sqlstmt = "Create table author(email varchar(100), name varchar(50), affiliation varchar(100), primary key(email));"; 
		      statement.executeUpdate(sqlstmt);
		      	      
		      sqlstmt = "Create table writes(paperid integer Auto_Increment, email varchar(50), ContNum integer, Primary Key (paperid,email), foreign key (paperid) references paper(paperid), foreign key (email) references author(email));"; 
		      statement.executeUpdate(sqlstmt);
		      
		      sqlstmt = "Create table pcmember( pcmemberID int AUTO_INCREMENT,email varchar(50), name varchar(20), primary key(pcmemberID));"; 
		      statement.executeUpdate(sqlstmt);
		      
		      sqlstmt = "create table review(reportid integer Auto_Increment, subDate DATE, description varchar(250), recommendation char(1), paperid integer, pcmemberID integer, unique(paperid, pcmemberID), Primary Key (reportid),foreign key (paperid) references paper(paperid), foreign Key (pcmemberID) references pcmember(pcmemberID));"; 
		      statement.executeUpdate(sqlstmt);
		      preparedStatement = connect
		              .prepareStatement("insert into  paper(title, abstract,pdf) values (?, ?,?)");
		          preparedStatement.setString(1, "title1");
		          preparedStatement.setString(2, "abstract1");
		          preparedStatement.setString(3, "pdf1");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title2");
		          preparedStatement.setString(2, "abstract2");
		          preparedStatement.setString(3, "pdf2");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title3");
		          preparedStatement.setString(2, "abstract3");
		          preparedStatement.setString(3, "pdf3");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title4");
		          preparedStatement.setString(2, "abstract4");
		          preparedStatement.setString(3, "pdf4");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title5");
		          preparedStatement.setString(2, "abstract5");
		          preparedStatement.setString(3, "pdf5");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title6");
		          preparedStatement.setString(2, "abstract6");
		          preparedStatement.setString(3, "pdf6");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title7");
		          preparedStatement.setString(2, "abstract7");
		          preparedStatement.setString(3, "pdf7");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title8");
		          preparedStatement.setString(2, "abstract8");
		          preparedStatement.setString(3, "pdf8");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title9");
		          preparedStatement.setString(2, "abstract9");
		          preparedStatement.setString(3, "pdf9");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "title10");
		          preparedStatement.setString(2, "abstract10");
		          preparedStatement.setString(3, "pdf10");
		          preparedStatement.executeUpdate();
		          preparedStatement = connect
			              .prepareStatement("insert into  author(email, name, affiliation) values (?, ?, ?)");
			      preparedStatement.setString(1, "email1@gmail.com");
		          preparedStatement.setString(2, "name1");
		          preparedStatement.setString(3, "affiliation1");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email2@gmail.com");
		          preparedStatement.setString(2, "name2");
		          preparedStatement.setString(3, "affiliation2");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email3@gmail.com");
		          preparedStatement.setString(2, "name3");
		          preparedStatement.setString(3, "affiliation3");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email4@gmail.com");
		          preparedStatement.setString(2, "name4");
		          preparedStatement.setString(3, "affiliation4");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email5@gmail.com");
		          preparedStatement.setString(2, "name5");
		          preparedStatement.setString(3, "affiliation5");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email6@gmail.com");
		          preparedStatement.setString(2, "name6");
		          preparedStatement.setString(3, "affiliation6");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email7@gmail.com");
		          preparedStatement.setString(2, "name7");
		          preparedStatement.setString(3, "affiliation7");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email8@gmail.com");
		          preparedStatement.setString(2, "name8");
		          preparedStatement.setString(3, "affiliation8");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email9@gmail.com");
		          preparedStatement.setString(2, "name9");
		          preparedStatement.setString(3, "affiliation9");
		          preparedStatement.executeUpdate();
		          preparedStatement.setString(1, "email10@gmail.com");
		          preparedStatement.setString(2, "name10");
		          preparedStatement.setString(3, "affiliation10");
		          preparedStatement.executeUpdate();
		      preparedStatement = connect
			              .prepareStatement("insert into  writes(paperid, email, ContNum) values (?, ?, ?)");
		      preparedStatement.setString(1, "1");
	          preparedStatement.setString(2, "email1@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "2");
	          preparedStatement.setString(2, "email2@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "3");
	          preparedStatement.setString(2, "email3@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "4");
	          preparedStatement.setString(2, "email4@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "5");
	          preparedStatement.setString(2, "email5@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "6");
	          preparedStatement.setString(2, "email6@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "7");
	          preparedStatement.setString(2, "email7@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "8");
	          preparedStatement.setString(2, "email8@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "9");
	          preparedStatement.setString(2, "email9@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "10");
	          preparedStatement.setString(2, "email10@gmail.com");
	          preparedStatement.setString(3, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement = connect
		              .prepareStatement("insert into  pcmember(email,name) values (?, ?)");
	          preparedStatement.setString(1, "pcmember1@gmail.com");
	          preparedStatement.setString(2, "pcmember1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember2@gmail.com");
	          preparedStatement.setString(2, "pcmember2");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember3@gmail.com");
	          preparedStatement.setString(2, "pcmember3");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember4@gmail.com");
	          preparedStatement.setString(2, "pcmember4");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember5@gmail.com");
	          preparedStatement.setString(2, "pcmember5");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember6@gmail.com");
	          preparedStatement.setString(2, "pcmember6");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember7@gmail.com");
	          preparedStatement.setString(2, "pcmember7");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "pcmember8@gmail.com");
	          preparedStatement.setString(2, "pcmember8");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "john@gmail.com");
	          preparedStatement.setString(2, "john");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "matt@gmail.com");
	          preparedStatement.setString(2, "matt");
	          preparedStatement.executeUpdate();
	          preparedStatement = connect
		              .prepareStatement("insert into review(reportid, subDate, description,recommendation, paperid, pcmemberid) values (?, ?, ?, ?, ?, ?)");
	          preparedStatement.setString(1, "1");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "1");
	          preparedStatement.setString(6, "1");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "2");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "1");
	          preparedStatement.setString(6, "2");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "3");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "1");
	          preparedStatement.setString(6, "3");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "4");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "2");
	          preparedStatement.setString(6, "4");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "5");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "2");
	          preparedStatement.setString(6, "5");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "6");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "2");
	          preparedStatement.setString(6, "6");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "7");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "3");
	          preparedStatement.setString(6, "7");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "8");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "y");
	          preparedStatement.setString(5, "3");
	          preparedStatement.setString(6, "8");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "9");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "n");
	          preparedStatement.setString(5, "4");
	          preparedStatement.setString(6, "9");
	          preparedStatement.executeUpdate();
	          preparedStatement.setString(1, "10");
	          preparedStatement.setString(2, "2018-06-11");
	          preparedStatement.setString(3, "none");
	          preparedStatement.setString(4, "n");
	          preparedStatement.setString(5, "4");
	          preparedStatement.setString(6, "10");
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
