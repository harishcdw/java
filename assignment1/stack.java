package assignment1;
import java.util.LinkedList;




interface stackInterface{
	void push(int value);
	int pop();
	void display();
}

class FixedStack implements stackInterface{
	final int stack[];
	int top;
	
	FixedStack(){
		stack=new int[5];
		top=-1;
	}
	
	
	public void push(int value) {
		if(top>=4) 
			System.out.println("Overflow");
		else 
			stack[++top]=value;
	}
	
	public int pop() {
		int remove;
		if(top==-1) {
			System.out.println("Underflow");
			return 0;
		}
		else {
			remove=stack[top--];
			return remove;
		}
	}
	
	public void display() {
		if(top==-1) 
			System.out.println("No elements to display");
		else 
			for(int i=0;i<=top;i++)
				System.out.println(stack[i]);	
	}
	
	
}






class DynamicStack implements stackInterface{
	int remove;
	LinkedList<Integer> l1;
	DynamicStack(){
		l1=new LinkedList<Integer>();
	}
	
	public void push(int value) {
		l1.add(value);
	}
	
	
	public int pop() {
		
		if(l1.size()==0) {
			System.out.println("Stack empty");
			return 0;
		}
		else {
			remove=l1.get(l1.size()-1);
			l1.remove(l1.size()-1);
			return remove;
		}
		
			
	}
	
	public void display() {
		if(l1.size()==0) 
			System.out.println("No elements to display");
			
		
		else 
			for(int i=0;i<l1.size();i++)
				System.out.println(l1.get(i));
		
	}
			
		
}





public class stack {
	
	public static void main(String[] args) {
		
		System.out.println("===============Fixed Stack=============");
		
		FixedStack f1 = new FixedStack();
		
		f1.push(3);
		
		f1.push(7);
		
//		f1.push(6);
//		
//		f1.push(5);
//		
//		f1.push(4);
//		
//		f1.push(9);
//		
//		f1.pop();
//		f1.pop();
//		f1.pop();
//		f1.pop();
//		f1.pop();
//		f1.pop();
		f1.display();
		System.out.println("===============Dynamic Stack=============");
		
		DynamicStack d1 = new DynamicStack();
		d1.push(3);
		d1.push(7);
		d1.push(6);
//		d1.push(5);
//		d1.push(4);
//		d1.push(9);
//		
//		d1.pop();
//		d1.pop();
//		d1.pop();
//		d1.pop();
//		d1.pop();
//		d1.pop();
//		d1.pop();
		

		d1.display();

	}

}
