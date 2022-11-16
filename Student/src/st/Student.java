package st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement st= con.createStatement();
			st.execute("Insert into stu values(1, 'Tom',7878787878)");
			con.close();
			System.out.println("Data Saved");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
