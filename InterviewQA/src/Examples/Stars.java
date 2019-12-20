package Examples;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printtriangle();
		/* printleft();
		 printright();
		 printdown();*/
	}
	public static void printleft()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printright()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printdown()
	{
		for(int i=5;i>=1;i--) 
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
		
			for(int j=1;i>=j;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printtriangle()
	{
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<(i*2);k++ )
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
