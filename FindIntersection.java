package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindIntersection {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(3);
	list.add(2);
	list.add(11);
	list.add(4);
	list.add(6);
	list.add(7);
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(8);
	list1.add(4);
	list1.add(9);
	list1.add(7);
	Collections.sort(list);
	for(Integer order:list) {
		System.out.println(order);
	}
	Collections.sort(list1);
	for(Integer order2:list1) {
		System.out.println(order2);
	}
	for(int i=0;i<list.size();i++) {
		for(int j=0;j<list1.size();j++) {
			if(list.get(i)==list1.get(j)) {
				System.out.println("Intersection Numbers are : " + list.get(i));
			}
		}
	}

		
	}

}
