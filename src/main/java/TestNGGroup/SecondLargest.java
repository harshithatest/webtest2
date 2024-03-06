package TestNGGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5, 12, 8, 3, 9, 6};
	  //   int arr[]={12, 4,6,8,9,34,3};
	       int max=arr[0];
	       for(int i=0; i<arr.length; i++){
	           if(arr[i]>max){
	               max=arr[i];
	           }
	       }
	       System.out.println(max);
		}
	}


