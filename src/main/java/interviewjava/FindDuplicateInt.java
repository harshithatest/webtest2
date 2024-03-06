package interviewjava;

public class FindDuplicateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,3,2,4,5,1};
  for(int i=0; i<arr.length; i++) {
	  for(int j=i+1; j<arr.length; j++) {
		  if(arr[i]==arr[j]) {
			  System.out.print(arr[j]);
		  }
		 
	  }
	   }
   
	}

}
