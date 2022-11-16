package vechile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vechile","root","root");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select*from car");
			while(rs.next())
			{
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("Brand: "+rs.getString(2));
				System.out.println("Color: "+rs);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
