package BasicJavaProg;

import java.lang.reflect.Array;

public class FindMaxandMinnum {
	static int array[]= {12,45,18,36,19};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=array[0];
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("max value is"+max);
		System.out.println("min value is"+min);
	}

}
