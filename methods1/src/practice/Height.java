package practice;
import java.util.*;
public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the height");
double a=sc.nextDouble();
Height h1=new Height();
System.out.println(h1.convertinchesToFeet(a));
	}
	public double convertinchesToFeet(double inches)
	{
		double feet=inches/12.0;
		return feet;
	}

}
