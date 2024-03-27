package practice;
import java.util.Scanner;
 class swap {

	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=scan.nextInt();
	System.out.println("enter the second number");
	int b=scan.nextInt();
swap(a,b);
	
	}
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
	
		System.out.println(a);
		System.out.println(b);
	}
	
 }


