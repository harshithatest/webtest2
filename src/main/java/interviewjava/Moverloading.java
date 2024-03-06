package interviewjava;



public class Moverloading {
	void sum(int a , int b) {
	System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moverloading mo= new Moverloading();
		mo.sum(1, 6);
		mo.sum(3, 2, 1);
		
		;
	}

}
