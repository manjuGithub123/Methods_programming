package practice;
import java.util.*;
public class Trouble {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	double d =doubleTheNumber(num);
	System.out.println(d);

	}
	public static double doubleTheNumber(int num)
	{
	return num*num;	
	}

}
