package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperators {
    public static void main(String args[]){
    HashSet<Integer> numbers= new HashSet<Integer>();
    Set<String> str=new HashSet<>();
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

        Boolean tf= str.contains("rajesh");
        System.out.println(tf);
    //delete operation
		str.remove("harshitha");
        System.out.println(str);


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
