package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection connection = null;
		try {

			// Đăng ký
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// Thông số
			String url = "jdbc:mySQL://localhost:3306/ontap";
			String user = "root";
			String password = "";

			// Tạo kết nối
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}

		return connection;
	}

	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printfInto(Connection connection) {
		DatabaseMetaData dtmt;
		try {
			dtmt = connection.getMetaData();
			System.out.println(dtmt.getDatabaseProductName());
			System.out.println(dtmt.getDatabaseProductVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
