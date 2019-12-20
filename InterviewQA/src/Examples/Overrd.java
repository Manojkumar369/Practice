package Examples;

public class Overrd extends Bbbb {
	public static void m1()
	{
		System.out.println("overrd");
	}

	public static void main(String[] args) {
		Bbbb obj1=new Overrd();
		Overrd.m1();
		
	}

}
