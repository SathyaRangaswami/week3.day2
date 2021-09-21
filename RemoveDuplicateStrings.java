package week3.day2.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateStrings {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java in week1";
		String[] split = text.split("//s");		
		
			Set<String> duparr=new LinkedHashSet<String>();
			//duparr.addAll(split);
			duparr.addAll(Arrays.asList(split));
				
	System.out.println("String without duplicates ----> "+duparr);
		
	}
		
}
