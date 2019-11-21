package jdbdDemo;


import java.sql.*;

public class JdbcPrograms {

	public static void main(String[] args) throws SQLException {
		
		Driver d = new oracle.jdbc.driver.OracleDriver();
		
		DriverManager.registerDriver(d);
		
		Connection com = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orac","system", "Darling143");
		
		Statement st = com.createStatement();
		
		st.execute("create table emp(eNo number(3), eNmae varchar(2))");
		
		com.close();
		
		System.out.println("table created ");
	}

}
