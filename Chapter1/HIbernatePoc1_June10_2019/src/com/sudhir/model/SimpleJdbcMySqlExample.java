/**
 * 
 */
package com.sudhir.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sudhirk
 *
 */
public class SimpleJdbcMySqlExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatepoc", "root", "123456");
		Statement createStatement = conn.createStatement();
		ResultSet resultSet = createStatement.executeQuery("select * from user");
		while (resultSet.next()) {
			System.out.println("id = " + resultSet.getInt(1) + "," + "name = " + resultSet.getString(2));
		}
	}
}
