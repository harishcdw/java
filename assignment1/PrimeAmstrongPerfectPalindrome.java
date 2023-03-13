package assignment1;

public class PrimeAmstrongPerfectPalindrome {
	public static void main(String[] args) {

		for(int k=1;k<=100;k++) {
			int count=0;
			for(int i=2;i<=k/2;i++) {
				if(k%i==0) 
					count+=1;
			}
			if(count<=0) {
				System.out.println(k);
			}
		}
		
		
		
		
		
		int n=153,sum=0,rem;
		int n1=n;
		while(n>0)    
		{    
			rem=n%10;    
			sum=sum+(rem*rem*rem);    
			n=n/10;    
		}  
		if(n1==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
		
		
		
		
		int n2=496;
		sum=0;
		for(int i=1;i<n2;i++) 
			if(n2%i==0)
				sum+=i;
		if(sum==n2)
			System.out.println("perfect number");
		else
			System.out.println("Not a perfect number");
		
		
		int n3=252;
		int n4=n3;
		sum=0;
		while(n4>0) {
			rem=n4%10;
			sum=sum*10+rem;
			n4=n4/10;
		}
		if(sum==n3)
			System.out.println("palindrome number");
		else
			System.out.println("Not a palindrome number");
		
		
	}
}
