package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str1 = "PayPal India";
		String str=str1.replaceAll("\\S ","");
		System.out.println(str);
		char[] charArray = str.toCharArray();
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupchar = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charset.add(charArray[i]);
		}			
		System.out.println("Charset" + charset);

		for (Character eachchar : charArray) {
			
				if(!dupchar.add(eachchar))
				System.out.println("duplicate :" + eachchar);

			}
		
	}
}
