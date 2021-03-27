package colleciondemo;
import java.util.*;
public class CustomerMap {
	private Map<Integer,Customer> mapcust;
	private Scanner sc;
	int noofcustomer;
	public CustomerMap()
	{
		sc=new Scanner(System.in);
		mapcust=new HashMap<Integer,Customer>();
		System.out.println("Enter no of users which u want to add");
		noofcustomer=sc.nextInt();
	}
	public void insertData()
	{
		for(int x=1;x<=noofcustomer;x++)
		{
			Customer c1=new Customer();
			System.out.println("Enter Customer code");
			c1.setCustcode(sc.nextInt());
			System.out.println("Enter Customer name ");
			c1.setCustname(sc.next());
			System.out.println("Enter aount");
			c1.setAmountoutstanding(sc.nextDouble());
			mapcust.put(c1.getCustcode(), c1);
			
		}
	
	}
	//public void retreiveData
	
	public static void main(String args[])
	{
		CustomerMap cmap=new CustomerMap();
		cmap.insertData();
	}

}
