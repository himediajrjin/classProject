package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<String ,SmartPhone>();
		
		SmartPhone p = new SmartPhone("Spring", "010-1111-2222"); 
		hashMap.put("ver", p);
		
		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222"); 
		hashMap.put("programName", p2);
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName"));
		
		System.out.println("------------------------");
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}

	}

}





