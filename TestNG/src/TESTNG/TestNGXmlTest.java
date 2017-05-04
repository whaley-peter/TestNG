package TESTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGXmlTest {
  
  @Parameters({"sUsername","password"})
  @Test
  public void f1(String sUsername,String password) {
	  System.out.println("ÓÃ»§Ãû:"+sUsername+"\n ÃÜÂë:"+password);
  }
}
