package Java.test;
 abstract class ab{
	abstract void name(); 
		ab(int a){
			a=10;
			System.out.println(a);
		}
	public void met() {
		System.out.println("hi");
	}
	public void met2(int a, int b) {
		System.out.println(a+b); 
		this.name();
	}
}
class child extends ab{
	 child(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	void name() {
		 System.out.println("ab method in child"); 
		 super.met();
		
	} 
}
abstract class child2 extends ab{

	child2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

}
public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child(7);
		
		
		obj.met2(3, 4);
		
	}

}
