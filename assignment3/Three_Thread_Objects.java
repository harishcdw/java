package assignment3;

public class Three_Thread_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer();
		s.append("A");
		SubThread st1=new SubThread(s);
		st1.start();
		SubThread st2=new SubThread(s);
		st2.start();
		SubThread st3=new SubThread(s);
		st3.start();
	}

}


class SubThread extends Thread{
	StringBuffer sb;
	public SubThread(StringBuffer sb){
		this.sb=sb;
	}
	@Override
	public void run() {
		synchronized (sb) {
			for(int i=1;i<=100;i++) {
				System.out.print(sb.toString());
			}
			System.out.println();
			char c = sb.charAt(0);      
		    c++;
		    sb.setCharAt(0 , c); 
		}
		
	}
	
}
