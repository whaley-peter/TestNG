package TESTNG;

import org.testng.annotations.Test;

public class Dependent {

  @Test(dependsOnMethods=("OpenBrower"))
  public void Login(){
	  System.out.println("�û���½");
	  System.out.println();
  }
  @Test(dependsOnMethods=("Login"))
  public void Logout(){
	  System.out.println("�˳���½");
  }

@Test
  public void OpenBrower(){
	  System.out.println("��app");
  }
  
}
