package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
		al.add("anu");
		al.add("hari");
		al.add("anu");
		String str="bye hello";
		String word[]=str.split("");
		//al.add(str)
		System.out.println(al);
		
		Set<String> set=new HashSet<>();
		set.addAll(Arrays.asList(str));
		set.addAll(al);
		System.out.println(set);
	}

}
