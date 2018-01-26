package sef.module9.sample;
// Complete Code
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSample {
	
	public static void main(String[] args) {
			
		Map map = new HashMap();
		map.put("1", "A String");
		map.put("2", new Date());
		map.put("3", new Integer(42));
		map.put("4", new Float(23.0f));
		//Beware of using the same key twice cause it will overwrite the value
		map.put("1", "Same key as A String");
		
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		
		
		new MapSample().print(map);
		
	}
	void print(Map map)
	{
		//Keys are maintained as set in map.
		Set keySet = map.keySet();
		
		//You can use an iterator to access keys
		System.out.println("*************************************");
		System.out.println("Key\tValue");
		Iterator it=keySet.iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
		System.out.println("*************************************");
		
	}
}