package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class testJDBCUtil {
	public static void main(String[] args) {
		
		try {
			//Step 1: Make connection to database
			Connection connection = JDBCUtil.getConnection();
			
			//Step 2: Create object Statement
			Statement st = connection.createStatement();		
			//Step 3: Execute SQL query
			String query = "INSERT INTO persons(last_name, first_name, gender, 	dob, income) values "
							+ "('Nguyen','Khanh','C', '2000-10-10',10000000)";
			
			int check = st.executeUpdate(query);
			//Step 4: Resolve the output
			System.out.println("Rows affected: " + check);
			
			//Step 5: Disconnecting from database
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
