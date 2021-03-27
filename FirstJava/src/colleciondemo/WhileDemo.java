package colleciondemo;

public class WhileDemo {
	int x=1;//Declaration of variable
	public void sumdata()
	{
		int sum=0;
	
		while(x<=10)
		{
			if(x%2==0)
			{
			sum=sum+x;
			}
			else
			{
				System.out.println("It is odd number");
			}
			x=x+1;
			System.out.println("Total is "+sum);

		}
	

	}
	public static void main(String args[])
	{
		WhileDemo wh=new WhileDemo();
		wh.sumdata();
	}
		
}
