package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClassoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		ArrayList<String> str=new ArrayList<String>();
		//add operation
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
	
		str.add("rajesh");
		str.add("harshitha");
		str.add("rajesh");
		System.out.println(numbers);
		System.out.println(str);
		
		//get operation
		int firstnum= numbers.get(0);
		String secondele=str.get(2);
		System.out.println(firstnum);
		System.out.println(secondele);
		
		//set operation/modification
		numbers.set(1, 25);
		str.set(1, "ravi");
		//delete operation
		numbers.remove(3);
		str.remove(2);
		
		System.out.println(str);
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
		for(int num:numbers) {
			System.out.println(num);
		}
		//size operation
		int size=numbers.size();
		int Ssize=str.size();
		System.out.println(size);
		System.out.println(Ssize);
		
		numbers.clear();
		str.clear();
		System.out.print(numbers);
		System.out.print(str);
		
	}

}
