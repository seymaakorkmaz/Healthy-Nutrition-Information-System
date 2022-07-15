package veritabani;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	String url = "jdbc:mysql://localhost:3306/database";
	String userName = "root";
	String password = "1234";
	String driver = "com.mysql.jdbc.Driver";
	
	public  Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/database";
		String userName = "root";
		String password = "1234";
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return connection;
	}
}
