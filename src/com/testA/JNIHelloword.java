package com.testA;

public class JNIHelloword {
   public native void sayHello();
   static{
	   System.loadLibrary("JNIHelloword");
   }
   public static void main(String[] args) {
	   JNIHelloword helloword = new JNIHelloword();
	   helloword.sayHello();
  }
}
