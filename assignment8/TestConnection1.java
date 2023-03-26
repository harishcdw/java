package assignment8;

import java.sql.*;

class MakeConnection1 {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection1() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","Root@1234");
			stmt = con.createStatement();
			int i=stmt.executeUpdate( "create table office(empno integer,ename varchar(20),deptno integer)");
			System.out.println("table created");
		}
		catch(Exception e) {
			System.out.println(e);
			}
		}
}

class TestConnection1 {
	public static void main(String args[]) {
		new MakeConnection1();
	}
}