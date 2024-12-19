package ImpQuestions;

public class diffBetween_String_StringBuilderStringBuffer 
{
	public static void main(String[] args) 
	{
		String s1="abc1";
		System.out.println(s1);
		
		
		StringBuffer sf=new StringBuffer("abc2");
		System.out.println(sf);
		System.out.println(sf.reverse());
				
		StringBuilder sb=new StringBuilder("abc3");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}

}
