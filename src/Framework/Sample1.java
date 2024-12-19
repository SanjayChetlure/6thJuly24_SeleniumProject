package Framework;
public class Sample1 
{
	//1: declaration
	private int num;   //global variable
	
	//2: initialization
	public Sample1(int a)
	{
		num=a;
	}
	
	//3: usage
	public void findSquareOfNum()
	{
		System.out.println(num*num);
	}
	
	
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1(10);
		s1.findSquareOfNum();
		System.out.println(s1.num);
	}
}
