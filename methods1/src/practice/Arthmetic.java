package practice;
import java.util.*;
public class Arthmetic {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=scan.nextInt();
	System.out.println("enter the second number");
	int b=scan.nextInt();
	System.out.println(subNumber(a,b));
	System.out.println(mulNumber(a,b));
	System.out.println(divNumber(a,b));
	System.out.println(remNumber(a,b));
	
	}
	public static int subNumber(int num1,int num2)
	{
		return num1-num2;
	}
	public static int mulNumber(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divNumber(int num1,int num2)
	{
		return num1/num2;
	}
	public static int remNumber(int num1,int num2)
	{
		return num1%num2;
	}

}
