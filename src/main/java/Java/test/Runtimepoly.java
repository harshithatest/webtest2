package Java.test;
class A{
	void run() {
		System.out.println("parent");
	}
}

public class Runtimepoly extends A {
void run() {
	System.out.println("child");//print child upcasting
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new Runtimepoly();
		obj.run();
	}

}
