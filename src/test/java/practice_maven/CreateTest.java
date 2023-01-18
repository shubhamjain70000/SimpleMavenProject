package practice_maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups="smoke")
	public void Create()
	{
		System.out.println("Project created successfully!!");
	}
	

	@Test(groups="smoke")
	public void edit()
	{
		System.out.println("Project modified successfully!!");
	}

}
