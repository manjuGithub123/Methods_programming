package practice;
import java.util.*;
public class Planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("the surface area of sphere");
    double a=sc.nextDouble();
    Planet p1=new Planet();
    System.out.println(p1.calculateSurfaceArea(a));
	}
	public double calculateSurfaceArea(double radius)
	{
		return 4*3.14*radius*radius;
	}

}
