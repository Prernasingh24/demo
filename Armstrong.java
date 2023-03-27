package pgdac_march23a;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=153;
		int m=n;
		int rem=0;
		int p=0;
		while(n!=0)
		{
		rem= n%10;
		//p+= rem*rem*rem;  //p= 3+3*3 +5*5*5 + 1*1*1
		p+=Math.pow(rem, 3);
		
		//System.out.println(rem);
		n=n/10; 


		}

		if( m==p)
		  System.out.println("number is armstrong");
		else 
		System.out.println(" not armstrong");
	}

}
