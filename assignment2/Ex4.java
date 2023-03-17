package assignment2;


class MyException extends Exception{
	int age;
	MyException(int age){
		this.age=age;
	}
	public String toString() {
		return "Your are under age";
	}
}



public class Ex4 {
	
	static void validate(int age) throws MyException{
		if(age<18) {
			throw new MyException(age);
		}
		else {
			System.out.println("Your are eligible for the process");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(23);
			validate(8);
		}
		catch(MyException e) {
			System.out.println(e);
		}

	}

}
