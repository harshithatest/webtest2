package interviewjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num[]= {1,2,3,5,6,4,3,1};
		
		//convert arrays to list
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(num));
		//add list to set
		Set<Integer> set= new HashSet<>(list);
		System.out.print(set);
		  // Convert the Set back to an array
        Integer[] result = set.toArray(new Integer[0]);

		
					System.out.print(Arrays.toString(result));
				
			
		}

	
	

}
