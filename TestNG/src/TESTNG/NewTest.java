package TESTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	  @Parameters({"sUsername","password"})
	  @Test
	  public void f2(String sUsername,String password) {
		  System.out.println("sUsername:"+sUsername+"\t password"+password);
	  }
}
