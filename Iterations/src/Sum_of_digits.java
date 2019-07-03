
public class Sum_of_digits {

	public static void main(String[] args) {
		/*	int x,a,b,c,d,n;
		a=321;
		
		b=a/100;
		n=a%100;
		c=n/10;
		n=n%10;
		d=n;
		
		x=b+c+d;
		System.out.println("Sum ="+x); */
		
		int a=1151,sum=0,rem;
		
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println("Sum ="+sum);
	}

}
