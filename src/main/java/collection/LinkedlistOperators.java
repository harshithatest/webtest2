package collection;

import java.util.LinkedList;

public class LinkedlistOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> num=new LinkedList<Integer>();
		LinkedList<String>	list=new LinkedList<String>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(num.size(), 40);
        list.add("ravi");
		list.add("raju");
		list.add("kamala");
		
		System.out.println(num);
		System.out.println(list);
		
		int first=num.get(0);
		String sec=list.get(1);
		System.out.println(first);
		System.out.println(sec);
		
		num.set(0, 50);
		list.set(0, "raju");
		
		num.remove(2);
		list.remove(1);
		
		System.out.println(num);
		System.out.println(list);
		
		int size=num.size();
		int Ssize=list.size();
		System.out.println(size);
		System.out.println(Ssize);
		
		
		num.clear();
		list.clear();
		System.out.println(num);
		System.out.println(list);
		
		
	}

}
