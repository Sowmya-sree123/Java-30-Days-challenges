package day_3;

import java.util.Scanner;

public class SimpleCalculator 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
