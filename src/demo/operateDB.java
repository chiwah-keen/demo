package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class operateDB {
		
	public static void main(String[] argss){
		Connection sqlconn = getConn();
		String sql = "select * from hello order by id desc limit 1";
		try{
		sqlconn.prepareStatement(sql);
			PreparedStatement pstmt = (PreparedStatement) sqlconn.prepareStatement(sql);
			pstmt.setString(1,  "Hello.");
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

	public static Connection getConn(){
			String driver = "com.mysql.jdbc.Driver";
		    String url = "jdbc:mysql://localhost:3306/samp_db";
		    String username = "root";
		    String password = "";
		    Connection conn = null;
		    try {
		        Class.forName(driver); //classLoader,加载对应驱动
		        conn = (Connection) DriverManager.getConnection(url, username, password);
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return conn;
	}
	
}
