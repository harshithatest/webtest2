package Java.test;

public class Numberpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454;
		int r,sum=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.print("palindrome");
			
		}else {
			System.out.print("not a palindrome");
		}
	}

}
