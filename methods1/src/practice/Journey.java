package practice;
import java.util.*;
public class Journey {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the s value");
double a=sc.nextDouble();
System.out.println("enter the t value");
double b=sc.nextDouble();
Journey j=new Journey();
System.out.println(j.calculateDistance(a,b));
	}
	public double calculateDistance(double s,double t)
	{
		return s*t;

}
}
