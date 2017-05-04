package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateDataProvider {
  @Test(dataProvider = "Authentication")
  public void test(String username,String password){
	  System.out.println("username:"+username+"\tpassword:"+password);
  }
  @DataProvider(name = "Authentication")
  public static Object[][]  credentials(){
	  return new Object[][]{
		  {"test1","123"},
		  {"test2","456"}
	  };
  }
}
