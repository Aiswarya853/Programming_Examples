package utilites;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import Execution.Engine;
import pages.TestCase01;

public class methodsListcall extends TestCase01 {
	static Method[] methods;
	public static void getmethodslistfrmTestCase01() {
		TestCase01 obj = new TestCase01();
	methods=	obj.getClass().getMethods();}
	
	public static void keyordsAndMethodcall() throws Exception {
		Engine engine = new Engine();
		try {
	for(int i =0; i<methods.length; i++) {
		String methodname = methods[i].getName();
		if(methodname.equalsIgnoreCase(engine.keyword)) {
			methods[i].invoke(methodname);
			break;
		}
		//else {System.out.println("The the menthodname is "+ methodname);}
		}}
	catch (Exception e){
		System.out.println( e.getMessage());}
		
		
	}
	
		
	}
	
/*
 * public static void main(String[] args) { getmethodsfromTestCase01(); }
 */
