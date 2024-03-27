package powern;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();
PowerApp p1=new PowerApp();
p1.num(a,b);
	}

}
