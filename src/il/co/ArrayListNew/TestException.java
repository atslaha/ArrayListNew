package il.co.ArrayListNew;

import java.util.Date;

public class TestException extends Exception {

	public TestException() {
		super();
		doAnything();
		System.err.println("Hello! Something gone wrong :) But this is under control. ");
	}

	private void doAnything() {
		System.err.println("This is method inside exception. It can do anything. For example, print current timestamp");
		System.out.println((new Date()).getTime());
		System.err.println("Wooooohooo!!!!");
	}

	public TestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TestException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TestException(String message) {
		super("My exception!!! " + message);
	}

	public TestException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
