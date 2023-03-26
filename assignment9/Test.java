package assignment9;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Connection con=JDBCUtility.getConnection();
		
		InvoiceMasterDAO dao=InvoiceMasterDAOImpl.getPrototype();
		Scanner inp = new Scanner(System.in);
		int ch;
		ch=inp.nextInt();
		switch(ch) {
		case 1:
			InvoiceMasterDTO dto1=dao.findByPrimaryKey(101, con);
			con=JDBCUtility.getConnection();
			List<InvoiceMasterDTO> list=Arrays.asList(dto1);
			System.out.println(list);
			break;
		
		case 2:
		
			Collection<InvoiceMasterDTO> dto3=dao.findByCustomerID(2,con);
			con=JDBCUtility.getConnection();
			System.out.println(dto3);
			break;
			
		default:
			System.out.println("Invalid case");
		}
	}
}