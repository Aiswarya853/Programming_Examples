package testNG;

import org.testng.annotations.Test;

public class skipATestCase {
	

		@Test(priority = 0)
		public void startTheCar(){
			System.out.println("Car Started");

		}
		@Test(priority = 1)
		public void putTheFirstGear(){
			System.out.println("Put the first gear");
		}
		@Test(priority = 2, enabled = false)
		public void putTheSecondGear(){
			System.out.println("Put the Second gear");
		}	
		@Test(priority = 3)
		public void putTheThirdGear(){
			System.out.println("Put the Third gear");
		}
		@Test(priority = 4)
		public void turnMusicOn() {
			System.out.println("turned the music on");
		}
	}
