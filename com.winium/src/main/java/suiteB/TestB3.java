package suiteB;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestB3 extends BaseClass{

	@Test
	public void testB3() throws InterruptedException{
		System.out.println("Start testing testB3");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testB3");
	}
}
