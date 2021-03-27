package colleciondemo;
import java.util.*;
public class InputData {
	private Scanner sc;//it can be used to take input from user
	double x;
	double y;
	public void accept()
	{
		sc=new Scanner(System.in);//we are initializing scanner class which will take input from user
		System.out.println("Enter Number 1");
		x=sc.nextDouble();
		System.out.println("Enter Number 2");
		y=sc.nextDouble();
		
		
	}
	public void add()
	{
		double sum=x+y;
		System.out.println("The result is "+sum);
	}
	public static void main(String args[])
	{
		InputData input=new InputData();
		input.accept();
		input.add();
	}

}
