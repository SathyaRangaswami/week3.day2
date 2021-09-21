package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysElements {
	public static void main(String[] args) {		
	
	Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	List<Integer> intlist=new ArrayList<Integer>();
	intlist.addAll(Arrays.asList(arr));	
	
	//find second largest
	Collections.sort(intlist);
	System.out.println("1st list sorted "+intlist);
	int size = intlist.size();
	Integer second = intlist.get(size-2);
	System.out.println(second+"is the second largest element in the array");
	//PrintDuplicatesInArray 
	Set<Integer> duparr=new HashSet<Integer>();
	for (Integer dupno : intlist) {
		if(!duparr.add(dupno))
			System.out.println("duplicate elements in the array"+dupno);
		
	}
	
	
	}
}
