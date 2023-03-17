package assignment2;

import java.io.File;
import java.io.FileInputStream;

public class Qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoException ie=new IoException();
		ie.test();
	}

}


class IoException{
	
	public void test() {
		File f1 = new File("sample.txt");
		FileInputStream fis=new FileInputStream(f1);
	}
}