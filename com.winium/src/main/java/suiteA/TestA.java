package suiteA;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestA extends BaseClass {
	@Test(priority=1)
	public void testA() throws InterruptedException{
		System.out.println("Start testing testA");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending testing testA");
	}
	
	@Test(priority=2)
	public void testAAA(){
		driver.get("http://yahoo.com");
	}

}
