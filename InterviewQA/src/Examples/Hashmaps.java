package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("vijay",100);
		//m.put("manoj", 121);
		m.put("nar",1213);
		m.put("prt", 1112);
		System.out.println(m);
		System.out.println(m.get("nar"));
		System.out.println(m.isEmpty());
		System.out.println(m.remove("vijay", 100));
		System.out.println(m);
		m.put("man", 1211);
		System.out.println(m.values());
		Set<Entry<String,Integer>> s=m.entrySet();
		Iterator<Entry<String,Integer>> itr=s.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> m1=itr.next();
			System.out.println(m1.getKey());
		}
		
	}

}
