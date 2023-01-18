package practice_maven;

import org.testng.annotations.Test;

public class SampleTest2 {
	
	
	@Test(groups="smoke")
	public void Test3()
	{
		System.out.println("---Test3--");
	}
	
	@Test(groups="regression")
	public void Test4()
	{
		System.out.println("---Test4--");
	}

}
