package extentreportpack;

import java.util.Arrays;
import java.util.Scanner;

public class Exercize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,12,98,67,9,78};

 int max=arr[0];
 for(int i=0; i<arr.length; i++) {
	 if(arr[i]>max) {
		max= arr[i];
	 }
 }System.out.println(max);
	}
}



