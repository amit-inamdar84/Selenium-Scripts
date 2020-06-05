package com.amit.web.corejava;

public class JavaIntroNotes {
	
	/*Core Java Includes:

		1. What is Java

		2. Features of Java

		3. JDK, JRE and JVM

		4. JVM Architecture

		5. Variables and Data Types in Java

		6. Increment and decrement operators in java

		7. Java If Statement

		8. Java if-else Statement

		9. Nested-if

		10. Switch Statement

		11. For Loop In Java

		12. For-each or Enhanced for Loop

		13. While Loop In Java

		14. Java Break Statement

		15. Java Continue

		16. Class, Object and Method

		17. Static and Non-Static Member Of Class

		18. Naming convention in Java

		19. Constructor in Java

		20. Return Type in Java

		21. Access Modifier

		22. This keyword in Java

		23. Method Overloading In Java

		24. Inheritance in Java

		25. Method overriding In Java

		26. Interface in Java

		27. Abstract Class in Java

		28. Super keyword in java

		29. Instance Initializer block

		30. Final Keyword in Java

		31. Java instanceof operator.

		32. Encapsulation in Java

		33. Static Block in Java

		34. Enum in Java

		35. Type Casting in Java

		36. Runtime polymorphism

		37. Abstraction in java

		38. Array in Java

		39. String in Java

		40. Stringbuffer in Java

		41. Stringbuilder in Java

		42. Exceptional Handling in Java

		43. Throw Keyword

		44. Throws Keyword

		45. Finally Block

		46. Collection Framework Architecture

		47. Array List

		48. Linked List

		49. Set

		50. Hash Set

		51. Linked Hash Set

		52. Tree Set

		53. Map

		54. Hash Map

		55. Linked Hash Map

		56. Tree Map.

		57. Hash Table

		58. Sorting in Collection

		59. Comparable interface

		60. Comparator interface

		61. Multithreading in Java

		62. Life cycle of a Thread

		63. Thread Scheduler in Java

		64. Thread Methods

		65. Java Thread Pool

		66. Java Thread Group

		67. Java Garbage Collection

		68. Synchronization in Java

		69. Deadlock in java
		
		Features of java:
		1. Simple: Easy to learn and quite simple syntax
		2. Object oriented: In java everything is object which has some data and behaviour.
		3. Portable: Java byte code can be carried to any platform.
		4. Platform independent: On compilation java program is compiled into bytecode. This byte code is platform independent and can be run on 
		any machine. Any machine with JRE can run Java programs.
		5. Secure: Java runs in JRE with no interaction with OS. Hence secure.
		6. Robust (property of being strong and healthy): It has automatic garbage collector and exception handling which makes memory management efficient.
		7. Architecture neutral: Compiler generates bytecodes which has nothing to do with computer architecture. Hence java program is easy to intrepret on
		any machine.
		8. High performance: Java enables high performance with the use of just in time compiler.
		9. Multithreaded: A thread is a separate program executing concurrently. Java programs can be written by defining multiple threads. The threads do
		not occupy separate memory instead they share a common memory.
		10. Distributed: We can create distributed applications in Java. We can access files by calling the methods from any machine on Internet.
		
		JDK: Provides environment to develop and run Java programs. JDK is a kit which includes - JRE and JVM.
		JRE: JRE is an installation package which provides environment to only run(not develop) the java program or application onto your machine. JRE is only
		used by them who only wants to run the Java programs i.e. end users.
		JVM: It is contained or inbuilt on both JDK and JRE. Whatever program you run using JDK or JRE goes into JVM and JVM is responsible for executing the
		Java program line by line. Hence it is also know as interpreter.
		JDK = JRE+Development tools
		JRE = JVM+Library classes
		
		JVM architecture: See com.amit.web.screenshots/Temp.png
		1. Method area: This area can be used to store all class code and method code. All classes bytecode is loaded and stored in this run time area and
		all static variable are created here.
		2. Heap memory: This area stores all objects that are created. It is the main memory of JVM. Non static variables are created in this area. This runtime
		area memory is finite. Method area and heap area are sharable memory areas.
		3. Java stack area: This area can be used to store information of the methods that is under execution. Java stack is a combination of stack frames
		where every frame will contain the state of single method. Here methods are executed. JVM by default creates two threads: main method and garbage
		collection thread. main thread is responsible to execute main program and create objects in heap area if it finds the new keyword in any method logic.
		Garbage collection thread is responsible to destroy all unused objects from heap area.
		4. PC register: This area will contain the address of the next instruction that have to be executed. If there are multiple threads in a program
		these threads will be registered by PC register. It also also allocates memory for such threads to execute.
		5. Java native stack: It is used for storing non java code. Non java code is called as native code.
		6. Execution engine: It is responsible for executing the program and contains two parts - Interpreter and JIT compiler. The java code will be executed
		by both of these simultaneously which will reduce the execution time and provides high performance. 	
		
		Comment : CTRL+SHIFT+/
		Format : CTRL+SHIFT+F
		Auto suggest syntax: CTRL+SPACEBAR
		
		Old log4j details:
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>
		//Testing github branch commit
		
		*/
	
	

}
