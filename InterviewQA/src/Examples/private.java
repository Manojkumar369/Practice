package Examples;

public class FinalVar {
	static private int a=20;
	public static void main(String[] args) {
	 
B b=new B();
//System.out.println(b.c);
//System.out.println(b.m1());//private variables are not visible outside class
 
	}
	

}
class B extends FinalVar
{
	int b=90;
	//int c=a+b;//private variables are not visible outside class
	private int m1()
	{
		//return c;
	}
	
}