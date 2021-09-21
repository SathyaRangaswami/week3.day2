package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		Integer[] arr1={3,2,11,4,6,7};
		Integer[] arr2= {1,2,8,4,9,7};
		List<Integer> intlist1=new ArrayList<Integer>();
		intlist1.addAll(Arrays.asList(arr1));
		List<Integer> intlist2=new ArrayList<Integer>();
		intlist2.addAll(Arrays.asList(arr2));
		System.out.println("1st list"+intlist1);
		System.out.println("2nd list"+intlist2);
		int size = intlist1.size();
		Integer second = intlist1.get(size-2);
		System.out.println(second);
		
		intlist1.retainAll(intlist2);
		System.out.println("intersection of arrays"+intlist1);
			
	}

}
