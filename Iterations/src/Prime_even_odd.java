
public class Prime_even_odd {

	public static void main(String[] args) {
		int a=1;
		int temp=0;
		for(int i=a;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			if(i%2!=0) 
				{
				System.out.println("Odd"+i);
				}
			for(int j=2;j<(i-1);j++)
			{	
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
				if(temp==0)
				{
					System.out.println("Prime"+i);
				}
				else 
				{
				temp=0;
				}
		}
	}
}
	


