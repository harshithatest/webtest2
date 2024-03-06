package TestNGGroup;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class ParamAnnot {
	@Test
	@Parameters({"val1","val2"})
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	
	}
	
}
