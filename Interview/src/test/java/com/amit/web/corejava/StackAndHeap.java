package com.amit.web.corejava;
//Refer page 236 of head first java.
//Stack and heap are memory areas in JVM.
//The currently executing method is on top in stack.
//The local variables of that method reside with the method in its frame.
//If another method is called inside a method then that method will be on top in stack.
public class StackAndHeap {
	int i = 10;//Instance variables live inside the object on the heap.
	VariablesDataType obj;//If instance variable is an object, the reference variable lives inside object in heap. The actual object lives in heap.
	
	//this method resides on stack
	public void test(int x){//x is a local variable that resides on stack frame of this method.
		test1(10);
		boolean status = false;
		x = 20;
		System.out.println(status+" "+x);
	}
	
	public void test1(int z){
		//Testing purpose
	}
	
	//Below is a local variable that is object reference.Only the reference lives on stack. The object itself lives in heap.  
	public void test2(StackAndHeap obj){
		
	}
	
	public static void main(String[] args) {
		StackAndHeap obj = new StackAndHeap();//Objects live in heap memory.
	}

}
