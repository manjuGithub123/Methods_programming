package square;

public class SquareApp {
public void num(double n)
{
	double sum=0;
	for(int i=1;i<=n;i++)
	{
		double a=Math.pow(i, 2);
		sum=sum+a;
	}
	System.out.println(sum);
}
}
