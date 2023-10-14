 package com.myprojectTest;
import com.msc.App;

import org.testng.Assert;
import org.testng.annotations.Test;
public class AppTest {
	
	@Test
	public void testlogin() {
		App myApp=new App();
		Assert.assertEquals(1,myApp.User_Login("abc","abc@123"));
	}
	
	@Test
	public void testlogin1() {
		App myApp=new App();
		Assert.assertEquals(0,myApp.User_Login("abc","abc@1223"));
	}
}
