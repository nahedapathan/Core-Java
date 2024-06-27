package Day1;

import java.util.Scanner;

public class StrongNumber {
	
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static boolean isStrongNumber(int number)
	{
		int originalNumber=number;
		int sum=0;
		while(number>0)
		{
			int digit=number%10;
			sum+=factorial(digit);
			number/=10;
		}
		return sum==originalNumber;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		if(isStrongNumber(number))
		{
			System.out.println(number +"Strong");
		}
		else {
			System.out.println(number+ "not Strong");
		}
	}

}
