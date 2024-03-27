package sumofdigit;

public class SumApp {
public void num(int n)
{
	int r;
	int sum=0;
	while(n!=0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
		
		
	}
	System.out.println(sum);
}
}
