package colleciondemo;
import java.util.*;
public class AgeDemo {
	int age;
	private Scanner sc;
	public void accept()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Age ");
		age=sc.nextInt();
	}
	public void display()
	{
		if(age>0)
		{
		System.out.println("Age is "+age);
		}
		else
		{
			System.out.println("This is incorrect age");
		}
	}
	public static void main(String args[])
	{
		AgeDemo a1=new AgeDemo();
		a1.accept();
		a1.display();
	}
	

}

//if..else
//Accept age from user. if age is less than 0 it should display an error message that it
//is incorrect age. if age is greater then 0 then it should display welcome message with age