package Listbox;

import java.util.ArrayList;
import java.util.List;

public class Demo 
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>();
		//ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("ganesh");
		al.add("ramesh");
		al.add("sureshabc");
		
		
		for(String s1:al)
		{
			System.out.println(s1.length());
		}
		
		System.out.println(al.size());
	}
}
