package day_3;

import java.util.Scanner;

public class LargestOfTwoNumbers 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("largest number");
		}
		else
		{
			System.out.println("Smallest number");
		}
	}

}
