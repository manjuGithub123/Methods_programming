
package gcdnumber;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
System.out.println("enter second number");
int b=sc.nextInt();
GcdApp g1=new GcdApp();
g1.num(a,b);
}

}
