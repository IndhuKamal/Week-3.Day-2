package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNum {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(3);
	list.add(2);
	list.add(11);
	list.add(4);
	list.add(6);
	list.add(7);
	Collections.sort(list);
	for(Integer order:list) {
		System.out.println(order);
		
	}
	int element = list.get(1);
	System.out.println("Second Largest Number is :" + element);
	}

}
