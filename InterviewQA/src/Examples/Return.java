package Examples;

public class Return {
	
	
	public int m1()
	{
		int div=0;
		int a=10,b=10;
		try {
			 div=a/b;
			 return div;
		}
		/*catch(ArithmeticException e){
			return 5;
		}*/
		catch(Exception ee) {
			return 1000000;
		}
		finally {
			System.out.println("hi");
		}
	}
	
	public static void m2(int j) {
		if (j<9) {
			return;	
			//j++; unreachable code after return statement
		}
		else
		{
			return;
			//j++; unreachable code after return statement
		}
	}

	public void m3(double j) {
		if (j>9) {
			return;	
			//j++; unreachable code after return statement
		}
		else
		{
			j++;
			System.out.println(j);
	}
	}
	
	public static void main(String args[])
	{
		Return r=new Return();
		m2(5);
	//	System.out.println(r.m1());
		//System.out.println(r.m2(4));  method return void, so println statement won't allow
		//r.m3(-1.0);
		boolean flag = true;
        System.out.println("Before return is executed");
        if(flag)
            return;
        
        System.out.println("After return is executed");
	}
}
