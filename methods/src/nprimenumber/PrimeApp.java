package nprimenumber;

public class PrimeApp {
	
public void num(int n)
{
	int count=0;

	for(int i=1;i<=n;i++)

			{
		count=0;
		for(int j=2;j<=i;j++)
		{
		if(i%j==0)
		{
			count++;
		}
		}
		if(count==1)
		{
			System.out.print(i+" ");
		}
			}
}
}
