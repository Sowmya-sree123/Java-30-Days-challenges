package day_3;

import java.util.Scanner;

public class GradingSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num>=90 && num<=100)
		{
			System.out.println("A");
		}
		else if(num>=75 && num<=89)
		{
			System.out.println("B");
		}
		else if(num>=50 && num<=74)
		{
			System.out.println("C");
		}
		else if(num>35 &&num<=49)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
