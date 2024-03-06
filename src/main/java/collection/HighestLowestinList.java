package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HighestLowestinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		list.add(27);
		list.add(16);
		list.add(45);
		list.add(21);
		
		//using collection max and min method
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		
		//using sorting
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}

}
