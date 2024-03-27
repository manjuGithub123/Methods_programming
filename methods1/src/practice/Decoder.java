package practice;
import java.util.*;
public class Decoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the char");
     char ch=sc.next().charAt(0);
     Decoder d=new Decoder();
     System.out.println(d.decodeCharacter(ch));
	}
	public int decodeCharacter(char ch)
	{
	 return (int)ch;	
	}
	
	

}
