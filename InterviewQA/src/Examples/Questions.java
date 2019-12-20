package Examples;

 class Answers {
public Answers()
{
	System.out.println("hai");
}
public Answers(int a)
{
	System.out.println("hai "+a);
}
	
	
/*	public static void m1()
	{
		m2();
		System.out.println("m1");
	}
public static  void m2()
{
	m1();
	System.out.println("m2");
}*/
}
class Questions extends Answers
{

	public Questions(int a) {
		System.out.println("bye");
	}

	
	public static void main(String[] args) 
	{
		//new Answers();
		
		//new Questions();
		new Questions(10);
		
	}
	
	
}
