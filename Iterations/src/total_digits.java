
public class total_digits {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a=11001,sum=0,rem;
		
		while(a>0)
		{
			rem=a%10;
			sum=sum+1;
			a=a/10;
		}
		System.out.println("Total digits ="+sum);
	}

}
