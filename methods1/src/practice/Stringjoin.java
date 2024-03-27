package practice;
import java.util.*;
public class Stringjoin {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	String a=sc.nextLine();
	System.out.println("enter the second string");
	String b=sc.nextLine();
	System.out.println(joinStrings(a,b));
	
	}
	public static String joinStrings(String a1,String a2)
	{
	return a1+a2;	
	}

}
