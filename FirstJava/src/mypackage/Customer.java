package mypackage;

public class Customer {
	public void acceptDetails()
	{
		System.out.println("Accepting Details of Customer");
	}
	public void displayDetails()
	{
		System.out.println("Displaying details of Customer");
	}
	//Create a method name displayDetails and call it from object.
	public static void main(String arg[])
	{
		Customer cust1;//REference variable, no memory is allocated
		cust1=new Customer();//It will allocate memory/memory address to object.
		cust1.acceptDetails();
		cust1.displayDetails();
	}
}
