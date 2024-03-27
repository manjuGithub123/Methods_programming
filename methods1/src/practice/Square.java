package practice;
import java.util.*;
public class Square {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	System.out.println(squareNumber(a));
	}
	public static int squareNumber(int num)
	{
		return num*num;
	}

}
