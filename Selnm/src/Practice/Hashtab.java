package Practice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashtab {

	public static void main(String[] args) {
		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("cus", "manoj");
		ht.put("sell","kumar");
		ht.put("bro","xxx");
		
		/*System.out.println("ht ele r"+ht);
		System.out.println(ht.clone());
		System.out.println("ht ele r"+ht);
		System.out.println(ht.get("cus"));
		System.out.println(ht.contains("bro"));*/
		
		Hashtable<String, String> htt=new Hashtable<String, String>();
		htt.put("cus", "manoj");
		htt.put("sell","kumar");
		htt.put("bro","xxx");
		htt.put("x11", "manoj");
		htt.put("sell", "xxx");
		
		//System.out.println(htt);	
		Set set=htt.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			 /*Object str = itr.next();*/
			 
		}
		Enumeration e=htt.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
