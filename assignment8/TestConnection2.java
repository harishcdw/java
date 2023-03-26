package assignment8;

import java.sql.*;

class MakeConnection2 {
	Connection con;
	Statement stmt;
	ResultSet rs;
	MakeConnection2() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","Root@1234");
			stmt = con.createStatement();
			int i1=stmt.executeUpdate(" insert into office values (001,'sakre',23)");
			int i2=stmt.executeUpdate(" insert into office values (002,'pradeep',223)");
			int i3=stmt.executeUpdate(" insert into office values (003,'vivek',243)");
			System.out.println("Data inserted");
			
		} 
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class TestConnection2{
	public static void main(String args[] ) {
		new MakeConnection2();
	}
}