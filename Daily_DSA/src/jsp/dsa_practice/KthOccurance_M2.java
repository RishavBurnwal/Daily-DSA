package jsp.dsa_practice;

import java.util.LinkedHashMap;

public class KthOccurance_M2 {
	
	public static void main(String[] args) {
		String s = "Hello";
		char[] arr = s.toCharArray();
		
		LinkedHashMap<Character, Integer> m1 = new LinkedHashMap<>();
		for(Character ele : arr) {
			if(m1.containsKey(ele)) {
				m1.put(ele, m1.get(ele)+1);
			}
			else {
				m1.put(ele, 1);
			}
		}
		for(Character key : m1.keySet()) {
			System.out.println(key + " = "+m1.get(key));
		}
	}

}
