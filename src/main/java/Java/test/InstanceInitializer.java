package Java.test;

 class Parent{
	Parent(){
		System.out.println("parent class constructor");
	}
	{
		System.out.println("parent class Instance initializer");
	}
}

public class InstanceInitializer extends Parent {
	 final int a;
	{
		
		System.out.println("Instance initializer block");
	}
	InstanceInitializer(){
		a=10;
		System.out.println("Constructor" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitializer obj=new InstanceInitializer();
	}

}
