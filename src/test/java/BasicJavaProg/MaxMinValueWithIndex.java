package BasicJavaProg;

import java.util.Arrays;

public class MaxMinValueWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,67,8,9,15,12};
		
		int max=Arrays.stream(arr).max().getAsInt();
		int min=Arrays.stream(arr).min().getAsInt();
		
		int maxIndex=0;
		int minIndex=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				maxIndex=i;	
			}
			if(arr[i]==min){
				minIndex=i;
			}
		}
		
		System.out.println("max number is"+ max);
		System.out.println("min number is" +min);
		System.out.println("max number index is" + maxIndex);
		System.out.println("min number index is" + minIndex);
		
	}

}
