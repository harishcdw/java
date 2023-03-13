package assignment1;

public class passbyValue {
	public static void main(String[] args) {
		
		System.out.println("<------Pass by Value------->");
		int x=20;
		System.out.println("Before Passing :"+x);
		pass(x);
		System.out.println("After passing :"+x);
		System.out.println();
		
		System.out.println("<------Pass by Reference(array)------->");
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		System.out.println("Before Passing :"+arr[2]);
		referenceArray(arr);
		System.out.println("After Passing :"+arr[2]);
		System.out.println();
		
		System.out.println("<------Pass by Reference(object)------->");
		passbyReference obj=new passbyReference();
		System.out.println("Before Passing :"+obj.a);
		reference(obj);
		System.out.println("After Passing :"+obj.a);
	}
	
	public  static void pass(int x) {
		x=50;
	}
	
	public static void reference(passbyReference obj) {
		obj.a=100;
	}
	public static void referenceArray(int[] ch) {
		ch[2]=70;
	}
	
}



class passbyReference{
	int a=10;
}