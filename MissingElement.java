package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(2);
	list.add(6);
	list.add(4);
	list.add(7);
	list.add(8);
	list.add(10);
	list.add(9);
	int sum1=0;
	int sum2=0;
	for(int i=0;i<list.size();i++) {
		sum1=sum1+list.get(i);
	}
		System.out.println(sum1);
		for(int j=1;j<=10;j++) {
			sum2=sum2+j;
			}
		System.out.println(sum2);
		System.out.println("Missing Element is :" + (sum2-sum1) );
			
		
	

	

	}

}
