import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		double n=sc.nextInt();
		double fact=1;
		
		for(int i=1;i<=n;i++)
		{
				fact=i*fact;
		}
		System.out.print("Factorial ="+fact);
		sc.close();
	}

}
