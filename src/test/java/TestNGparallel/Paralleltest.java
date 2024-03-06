package TestNGparallel;

import org.testng.annotations.Test;

public class Paralleltest {

	@Test(invocationCount=4, timeOut=1000 )
	public void method() {
		System.out.println("met 1");
	}
	@Test
	public void method2() {
		System.out.println("met 2");
	}
	@Test(groups="reg")
	public void method3() {
		System.out.println("met 3");
	}
}
