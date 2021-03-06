package com.java.lessons.l2.abst.lib;

/*

public String getMessage()
	Returns a detailed message about the exception that has occurred. This message is initialized in the Throwable constructor.
public Throwable getCause()
	Returns the cause of the exception as represented by a Throwable object.
public String toString()
	Returns the name of the class concatenated with the result of getMessage()
public void printStackTrace()
	Prints the result of toString() along with the stack trace to System.err, the error output stream.
public StackTraceElement [] getStackTrace()
	Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
public Throwable fillInStackTrace()
	Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.

*/

public class TaskException extends Exception{
	  public TaskException() { super(); }
	  public TaskException(String message) { super(message); }
	  public TaskException(String message, Throwable cause) { super(message, cause); }
	  public TaskException(Throwable cause) { super(cause); }
}
