package mypackage;

public class CalculatorVar {
	int number1;
	int number2;//Declaration of Variable
	public void accept()
	{
		number1=90;//Initialization of Variable
		number2=30;
	}
	public void add()
	{
		int sum=number1+number2;
		System.out.println("Sum of Two numbers are "+sum);
	}
	public void subtract()
	{
		int difference=number1-number2;
		System.out.println("Subtraction of two numbers are "+difference);
	}
	public static void main(String args[])
	{
		CalculatorVar cal=new CalculatorVar();
		cal.accept();
		cal.add();
		cal.subtract();
	}

	

}
