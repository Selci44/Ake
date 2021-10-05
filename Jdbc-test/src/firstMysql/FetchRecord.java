package firstMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class FetchRecord {
	 public static void main(String[] args)throws Exception{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selciya", "root", "Selci@44");
	     Statement stmt=con.createStatement();
	     String sql = "CREATE TABLE Student2 " + "(id INT not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INT, " + " PRIMARY KEY ( id ))";
	    //int result= stmt.executeUpdate("insert into  student1 values(33,'Irfan','Ali',23);;
	     //int result = stmt.executeUpdate("update student1 set name='Vimal',age=23 where id=33");
	     //int result6=stmt.executeUpdate("delete from student where id=33");
	     System.out.println(sql+"records affected");
	     con.close();
	 }

	}



