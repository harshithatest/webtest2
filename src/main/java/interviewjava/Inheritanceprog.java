package interviewjava;
class Animal{
void animal() {
	System.out.println("animal");
}}
class Dog extends Animal{
	void dog() {
	System.out.println("dog");
}}
public class Inheritanceprog {

	public static void main (String[] args) {
		Dog dg =new Dog();
	dg.dog();//dog
	dg.animal();//animal
	
	Animal an= new Dog();
	an.animal();//animal
	

}
}