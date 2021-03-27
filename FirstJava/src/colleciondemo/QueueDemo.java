package colleciondemo;
import java.util.*;

public class QueueDemo {
	private Queue<String> queuedata;
	private Scanner sc;
	public QueueDemo()
	{
		queuedata=new LinkedList<String>();
		sc=new Scanner(System.in);
	}
	public void acceptdata()
	{
		for(int x=1;x<=3;x++)
		{
			System.out.println("Enter Complaints ");
			String str=sc.next();
			queuedata.add(str);
		}
	}
	public void display()
	{
		
		System.out.println("First data"+queuedata.element());
		System.out.println("Second data "+queuedata.peek());//element will throw exception
		//with empty queue but peek will just return null
		System.out.println("Third data"+queuedata.element());
		queuedata.remove();
		queuedata.remove();
		queuedata.remove();
		queuedata.poll();//remove will exception if u try to remove data in empty queue
		
	//	System.out.println("Forth data"+queuedata.peek());
		
	}
	public static void main(String ar[])
	{
		QueueDemo qd=new QueueDemo();
		qd.acceptdata();
		qd.display();
	}
}
