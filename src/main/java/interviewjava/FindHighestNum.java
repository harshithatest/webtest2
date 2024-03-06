package interviewjava;

public class FindHighestNum {
public static void main(String args[]) {
	int a=10;
	int b=20;
	//using if condition
	if(a>b) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
	
	//using ternary operation
	int c=a>b ? a:b;
	System.out.println(c);
	
	//Math.max function
	int d=Math.max(a, b);
	System.out.println(d);
}
}
