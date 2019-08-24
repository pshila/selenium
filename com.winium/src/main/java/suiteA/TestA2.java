package suiteA;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestA2 extends BaseClass {
	@Test
	public void testA2() throws InterruptedException{
		System.out.println("Start testing testA2");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testA2");
	}

}
