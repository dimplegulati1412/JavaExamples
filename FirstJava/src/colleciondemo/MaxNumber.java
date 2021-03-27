package colleciondemo;
import java.util.*;
public class MaxNumber {
	int number1;
	int number2;
	private Scanner sc;
	public void accept()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		number1=sc.nextInt();
		System.out.println("Enter Number 2");
		number2=sc.nextInt();
		
	}
	public void max()
	{
		if(number1>number2)
		{
			System.out.println("Number 1 is maximum");
		}
		else
		{
			System.out.println("Number 2 is maximum");
		}
	}
	public static void main(String args[])
	{
		MaxNumber maxobj=new MaxNumber();
		maxobj.accept();
		maxobj.max();
	}

}
