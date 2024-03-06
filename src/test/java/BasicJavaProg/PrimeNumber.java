package BasicJavaProg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		int flag=0;
		for(int j=2; j<num; j++) {
			if(num%j==0) {
				flag=0;
				break;
			}else {
				flag=1;
			}
			
		}
		if(flag==1) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}

}
