package interviewjava;

class Addition{
	int a=10;
	Addition(){
		System.out.println("addition");
		}
	void met1() {
		
		System.out.println("hi");
	}
}
public class Moveriding extends  Addition{
	int a=20;
	void met1() {
		System.out.println(super.a);
		super.met1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveriding mo=new Moveriding();
		mo.met1();
		
		
	}

}
