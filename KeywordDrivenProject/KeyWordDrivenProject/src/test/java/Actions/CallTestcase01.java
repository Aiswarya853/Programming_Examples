package Actions;

import pages.TestCase01;

public class CallTestcase01 extends TestCase01 {

	public static void main(String[] args) throws InterruptedException {
		//TestCase01  =new TestCase01();
		openBrowser();
		NavigatetoURL();
		userNameSend();
		pswdNameSend();
		loginClick();
		quitBrowser();
	}

}
