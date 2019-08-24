package suiteB;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestB2 extends BaseClass {
	@Test
	public void testB2() throws InterruptedException{
		System.out.println("Start testing testB2");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testB2");
	}

}
