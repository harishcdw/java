package assignment1;

class Student1 {
	String name;
	int rollno;
	 public Student1(){
		name="Hari";
		rollno=1;
	 }

}


class Exam extends Student1{
	int[] marks=new int[3];
	public Exam() {
		marks[0]=93;
		marks[1]=91;
		marks[2]=88;
	}
}

class Result extends Exam{
	int totalMark;
	public Result() {

	}
	public void totalmark() {
		totalMark=marks[0]+marks[1]+marks[2];
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollno);
		System.out.println("Total : "+totalMark);
	}
}


public class Student{
	public static void main(String args[]) {
		Result r1 = new Result();
		r1.totalmark();
	}
}