package Examples;

public class StringPolin {

	public static void main(String[] args) {
		String str="manojonam";
		String dup="";
		for(int i=str.length()-1;i>=0;i--)
		{
			dup=dup+str.charAt(i);
		}
		if(str.equals(dup))
		{
			System.out.println("polindrome");
		}
	}

}
