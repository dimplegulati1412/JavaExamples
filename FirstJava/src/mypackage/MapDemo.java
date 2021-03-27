package mypackage;
import java.util.*;
public class MapDemo {
	private Map<Integer,String> mapdemo;
	public MapDemo()
	{
		mapdemo=new HashMap<Integer,String>();
		mapdemo.put(1, "Data1");
		mapdemo.put(2, "Data 2");
		mapdemo.put(3, "Data 3");
	}
	public void display()
	{
		Set<Map.Entry<Integer,String>> mapentry=mapdemo.entrySet();
		for(Map.Entry<Integer,String> msingle:mapentry)
		{
		System.out.println("Key is "+msingle.getKey());
		System.out.println("Value "+msingle.getValue());
		}
	}
	public static void main(String args[])
	{
		MapDemo mdemo=new MapDemo();
		mdemo.display();
	}

}
