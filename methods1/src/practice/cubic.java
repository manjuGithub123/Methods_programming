package practice;
import java.util.*;
public class cubic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	System.out.println(cubeNumber(a)
			);

	}
	public static int cubeNumber(int num)
	{
		return num*num*num;
	}

}
