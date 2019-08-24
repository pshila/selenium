package suiteA;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestA3 extends BaseClass {
	@Test
	public void testA3() throws InterruptedException{
		System.out.println("Start testing testA3");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testA3");
	}

}
