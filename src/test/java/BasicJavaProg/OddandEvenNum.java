package BasicJavaProg;

public class OddandEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,11,25,47};

 for(int i=0; i<arr.length; i++) {
if(arr[i]%2!=0) {
	System.out.print("odd no"+ arr[i]);
}
}

 
 for(int i=0; i<arr.length; i++) {
	 if(arr[i]%2!=1) {
		 
	System.out.print(arr[i]);
	
}

 }System.out.print("even");
	
	}

}
