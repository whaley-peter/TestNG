package TESTNG;

import org.testng.annotations.Test;

public class Dependent {

  @Test(dependsOnMethods=("OpenBrower"))
  public void Login(){
	  System.out.println("用户登陆");
	  System.out.println();
  }
  @Test(dependsOnMethods=("Login"))
  public void Logout(){
	  System.out.println("退出登陆");
  }

@Test
  public void OpenBrower(){
	  System.out.println("打开app");
  }
  
}
