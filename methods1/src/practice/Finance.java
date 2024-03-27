package practice;
import java.util.*;
public class Finance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("the simple interest");
     double p=sc.nextDouble();
     double r=sc.nextDouble();
     double t=sc.nextDouble();
     Finance f1=new Finance();
     System.out.println(f1.calculateSimpleInterest(p,r,t));
	}
	public double calculateSimpleInterest(double principal,double rate,double time) {
		return principal*rate*time;
	}

}
