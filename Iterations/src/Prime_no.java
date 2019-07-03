
public class Prime_no {

	public static void main(String[] args) {
		int a=5,b=0;
		
		for(int i=2;i<=(a-1);i++)
		{
			if(a%i==0)
			{	
				b=b+1;
			}
		}
			if(b>0)
			{
				System.out.println("Not prime no");
			}
			else
				System.out.println("Prime no");
			}
	

}
