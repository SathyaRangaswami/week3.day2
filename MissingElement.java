package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[] args) {
		//MissingElementin Array	
		Integer[] arr1 = {0,1,2,3,4,7,6,8};
		List<Integer> list1=new ArrayList<Integer>();
		list1.addAll(Arrays.asList(arr1));	
		Collections.sort(list1);
		System.out.println("sorted array"+list1);
		for (int i = 0; i < arr1.length; i++) {
			
		if(i!=arr1[i])
		{
			
			System.out.println("Element is missing" +i);
			break;
		}
		}
		
	}

}
