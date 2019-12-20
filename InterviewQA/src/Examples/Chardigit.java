package Examples;

public class Chardigit {

	public static void main(String[] args) {
		String str="manoj123kumar369";
		for(int i=0;i<str.length();i++)
		{
			boolean b=Character.isDigit(str.charAt(i));
			System.out.println(str.charAt(i)+" is character "+ b);
			
		}
		System.out.println(Character.isLowerCase(str.charAt(1)));
	}

}
