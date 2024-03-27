package palindrome;

public class PalindromeApp {
public void num(int n)
{
	int r;
	int rev=0;int temp=n;
	while(n!=0)
	{
	r=n%10;
	rev=(rev*10)+r;
	n=n/10;
	}
	if(temp==rev)
	{
		System.out.println("it is palindrome");
	}
	else
	{
		System.out.println("it is not");
	}
}
}
