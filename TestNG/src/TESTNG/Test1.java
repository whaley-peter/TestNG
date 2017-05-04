package TESTNG;

import org.testng.annotations.Test;

public class Test1 {
	public static void main(String[] args) {
		
	}
	@Test(priority=4)
	public void one(){
		System.out.println("one");
	}
	@Test(priority=3)
	public void two(){
		System.out.println("two");
	}
	@Test(priority=2,enabled=false)//跳过此方法执行
	//@Test(priority=2)
	public void Three(){
		System.out.println("three");
	}
	@Test(priority=1)
	public void four(){
		System.out.println("four");
	}
}
