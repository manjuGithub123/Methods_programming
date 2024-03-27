package fibonacci;

public class FiboApp {
public static void num(int n)
{
	int fib1=0;int fib2=1;
	int fib3;
	System.out.print(fib1+" "+fib2+" ");
	for(int i=1;i<=n;i++)
	{
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.print(fib3+" ");
	}
}
}
