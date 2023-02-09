package PomclassDummy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseclassD.Baseclass;

public class TS_1D extends Baseclass
{
	@Test
	public void ecom() throws InterruptedException
	{
	 	PomclassD pomd = new PomclassD(driver);
	 	
	 	String t = pomd.gettit();
	 	System.out.println(t);
	 	Assert.assertEquals(t,"My Kart");
	 	Thread.sleep(5000);
	 	String sh = pomd.shop();
	 	System.out.println(sh);
	 	Assert.assertEquals(sh,"Shopping should be fun, convenient and affordable");
	 	
	 	pomd.adibag();
	 	Thread.sleep(5000);
	 	UtilityClass.javascript(driver);
	 	Thread.sleep(5000);
	 	
	 	pomd.addcart();
	 	Thread.sleep(5000);
	 	
	 	pomd.cart();
	 	Thread.sleep(5000);
	 	
	 	String in = pomd.counting();
	 	System.out.println(in);
	 	//Assert.assertEquals(in, "1");
	 	
	 	pomd.delet();
	 	Thread.sleep(5000);
	 	
	}
}
