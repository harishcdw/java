package assignment5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Memento {
	public static void main(String[] args)throws Exception {
		/**
		 * Memento pattern  -  helps to store state of an object and keep track of previous state
		 */
		ObjectOutputStream currversion=new ObjectOutputStream(new FileOutputStream("version1.dat"));
		
		Project pro=new Project();
		System.out.println("Project val : "+pro.val);
		pro.val=1;
		
//		saving the version
		currversion.writeObject(pro);
		
		pro.val=2;
		System.out.println("Project val : "+pro.val);
		
//		retrieving from the version
		ObjectInputStream currVersion1=new ObjectInputStream(new FileInputStream("version1.dat"));
		pro=(Project)currVersion1.readObject();
		
		System.out.println("Project val : "+pro.val);
		
	}
}
class Project implements Serializable{
	int val=0;
}