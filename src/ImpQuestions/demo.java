package ImpQuestions;

import java.time.LocalDate;

public class demo 
{
	public static void main(String[] args)
	{
//		String s1="abc";
//		String s2="abc";
//		String s3="abc";
//		
//		s3=s3+"xyz";  //  abc+xyz  = abcxyz
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		
		
		String date1 = LocalDate.now().toString();    //2024-12-13
		date1=date1.substring(8);    //13
		System.out.println(date1);
		
	}

}
