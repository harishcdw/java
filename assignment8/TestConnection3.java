package assignment8;

import java.sql.*;

class MakeConnection3 {
	Connection con;
	Statement stmt;
	ResultSet rs;

MakeConnection3() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","Root@1234");
		stmt = con.createStatement();
		rs=stmt.executeQuery("select * from office");
		while(rs.next())
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+" "+rs.getInt(3));
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class TestConnection3 {
	public static void main(String args[]) {
		new MakeConnection3();
	}
}