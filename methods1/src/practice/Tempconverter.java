package practice;
import java.util.*;
public class Tempconverter {

	public static void main(String[] args) {
		double C;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Fah value");
    double  F=sc.nextDouble();
	System.out.println(convertFahtoCel(F));

	}
	public static double convertFahtoCel(double F)
	{
		return (F-32)*5/9;
	}

}
