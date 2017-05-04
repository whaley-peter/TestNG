package TESTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yyyyy {
	  @Parameters({"username","password"})
	  @Test
	  public void f(String username,String password) {
		  System.out.println("username:"+username+"\n password:"+password);
	  }
}
