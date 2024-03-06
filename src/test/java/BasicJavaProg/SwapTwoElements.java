package BasicJavaProg;

import java.util.Scanner;

public class SwapTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x,y,z;
 x=sc.nextInt();
y=sc.nextInt();
System.out.println("enter x value"+x +" "+"enter y value"+y);

z=x;
x=y;
y=z;
System.out.println("x value"+x +" "+" y value"+y);


	}

}
