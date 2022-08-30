package week3.Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
	    set.add("1");
	    set.add("12");
	    set.add("22");
	    set.add("34");        
	    set.add("12");
	    set.add("56");
	    set.add("22");
	    set.add("78");
	    set.add("1");
	    set.add("12");
	    set.add("22");
	    List<String> list=new ArrayList<String>(set);
	    System.out.println(list);
	    
	}

}
