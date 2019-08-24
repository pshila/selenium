package suiteB;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestB extends BaseClass {
	@Test
	public void testB() throws InterruptedException{
		System.out.println("Start testing testB");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testB");
	}

}
