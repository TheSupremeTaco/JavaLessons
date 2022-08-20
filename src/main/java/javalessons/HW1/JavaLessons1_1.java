package javalessons.HW1;

public class JavaLessons1_1 {
	public static void main( String [] args)
	{
		System.out.println("test");
	}

//Java Basics 6.1

//Installing Java Notes
/*	
 * Creating system environment variables on Windows 10
 *		setx command (cmd)
 *			Use setx command to create user environment variables
 *				Use the /M flag after setx to create system environment variables
 *				example: setx /M JAVA_HOME "C:\Program Files\Java"
 *				example: setx /M MAVEN_HOME "C:\Program Files\apache-maven-3.8.6\bin"
 *			Use the setx command to edit the PATH system environment variable
 *				Use the /M flag to edit the System PATH enviro var
 *				example: setx /M PATH "%PATH%;%JAVA_HOME%;%MAVEN_HOME"
 *				example: setx /M PATH "%PATH%;C:\your\path\here\"
 *				QuickNote: separate multiple paths using semicolon
 *		pwd command (bash)
 *			Use pwd to find what current directory you are in
 *			example: pwd
 *			/c/Users/maksy
 *		cd command (cmd)
 *			Use cd to find what current directory you are in
 *			Use cd .. to go back a directory
 *			Use cd . (and tab) to see all hidden files
 *			Use cd /directory to change directories
 *		echo command (cmd)
 *			Use echo to values of variables
 *			example: echo %JAVA_HOME%
 *			C:\Program Files\Java
 *		java -version command
 *			Use java -version to check if java/app was installed
 *	
 *	Using Maven
 *		Must have JAVA_HOME variable set correctly
 *		Navigate to active directory
 *		mvn package command
 *			creates a jar file w/ a snapshot of current project
 *		mvn install command
 *			creates file directory of current project
 *	
 *	Using Github
 *		git init command
 *			initializes a git repo at current directory
 *		git add command
 *			adds a folder to monitor for current repo
 *		git status
 *			checks for differences between local and master branch of repo
 *		git commit 
 *			add changes to be made from local repo
 *			will need to add a commit message in text editor (press insert key)
 *				to quit out of a editor/viewer use escape key and ":wq"
 *		git commit -m "Commit message"
 *			creates a commit with given message w/o text editor pop-up
 *		git commit -amend
 *			allows user to change last commit message
 *		git push
 *			applies changes from local branch to master branch
*\
//Java JDK,JRE, and JVM
/*
 * 	Java Execution Flow
 *
 *		START
 *		Developer creates Simple.java
 *			Java source code file (created in IDE... eclipse/Intellij)
 *		File is compiled
 *			Java compiler creates Java byte from java file
 *			Library code imported in usage is added for execution
 *		File is executed in OS
 *			JVM turns byte code into native machine code
 *			machine code is executed by operating system
 *		FINISH
 *		
 *	JVM (Java Virtual Machine)
 *		Runs byte code from compiler
 *			Compiler creates byte code by turning .java files in .class files 
 *			.class files contain byte code used by JVM
 *		Optimal Performance
 *			Uses latest memory model, garbage collector, and adaptive optimizer
 *		Two flavors (client/server)
 *			CLIENT flavor is meant for individual user case
 *			SERVER flavor has been tuned for max performance, intended for executing long-
 *			running server applications (need fast start-up/smaller runtime memory footprint)
 *		JVM is virtual because its doesn't rely on underly OS/hardware architecture
 *		JVM Class Loader
 *			Class loader is a subsystem used for loading class files
 *				Loading
 *					Three main types of loaders: Bootstrap, extension, and application
 *						First bootstrap tries to find the class in the rt.jar file in JRE lib folder
 *						Then if not found, extension class loader searches inside jre\lib\ext folder
 *						Lastly, application searches all Jar files/classes in CLASSPATH enviro variable of sys
 *						A ClassNotFoundException is thrown if no class/jar file was found
 *				Linking
 *					A byte code verifier checks whether byte code is proper and gives a verification
 *					error if failed.
 *					Performs memory allocation for static variables/methods in the class
 *				Initialization
 *					All static variables/methods assigned with original values will be executed
 *		JVM Memory Areas
 *			Divided into four multiple parts
 *				Method Area
 *					Stores class structure (i.e. metadata), constant runtime pool, and method code
 *				Heap
 *					All created objects during application execution
 *				Stack
 *					Stores local variables/intermediate results, local variables have their own JVM
 *					thread (scope).
 *				PC Register
 *					Stores physical addresses of statement currently executing, each thread has separate
 *					PC register.
 *				Native Code (optional)
 *					Holds instruction of native code
 *		JVM Execution Engine
 *			Reads byte code and executes, uses interpreter/JIT Compiler for byte code to machine code execution
 *				Interpreter 
 *					Converts each byte-code to native instruction for different OS w/o optimization
 *				JIT Compiler
 *					Takes blocks of code (not one line like interpreter) to optimize code and translate to native	
 *	JRE (Java Runtime Environment)
 *		Bundles libraries (jars), JVM, and other components to RUN applications written in Java
 *	JDK (Java Development Kit)
 *		Superset of JRE with development tools for developing, debugging, and monitor Java applications
 *
*/			
//Difference between 32-bit Java Vs. 64-bit Java
/*
 * Memory Size
 * 		32-bit systems are limited to 4gb of ram, half of 4gb is reversed for system use only
 * 		Address space must be continuous to be used, so only 1.5-1.8Gb of heap is left
 * 		64-bit systems with windows Home-Edition have up to 16Gb of ram, Professional 192Gb
 * Heap Size
 * 		In 64-bit system heap sizes require 30-50% more than 32-bit systems, due to 64-bit memory architecture
 * Longer Garbage Collection Pauses
 * 		Larger heap sizes means more work during garbage collection, building heaps larger than 12-16Gb may result
 * 		in GC (garbage collection) pauses spanning several minutes
 * Compatibility
 * 		32-bit compiler can be used on 64-bit java using WoW64 (application switches to 32 bit architecture) 
 * 		Max ram allocated to java on a 32-bit machine is 1.5Gb
 */
//Difference between Java.exe and Javaw.exe
/*
 * Javaw launches with a GUI and Java launches with a CLI
 */
//Java Naming Conventions
/*
 * Naming Packages
 * 		Group of words separated by dots and all lower-case, always starts with a domain name
 * 		example: package com.howtodinjava.webapp.controller;
 * 		example: package com.quintrex.javalessons
 * 		TIP: convention goes from broad to specific
 * Naming Classes
 * 		Classes are nouns, first letter of each word capitalized
 * 		example: public class ArrayList {}
 * 		example: public class Employee {}
 * Naming Interfaces
 * 		Interfaces are adjectives, first letter of each word is capitalized
 * 		example: public interface Serializable {}
 * 		example: public interface Iterable {}
 * Naming Methods
 * 		Methods are always verbs, camel case notation
 * 		example: public Long getId() {}
 * 		example: public void remove(Object o) {}
 * Naming Variables
 * 		camel case, temporary variables can be a single character
 * 		example: public Long id;
 * 		example: public EmployeeDao emloyeeDao;
 * Naming Constants
 * 		All upper-case, separated by underscore 
 * 		example: public final String SECURITY_TOKEN = "..."
 * 		example: public final int INTIAL_SIZE = 16;
 * Naming Generics
 * 		Upper-case single letters
 * 		example: public interface Map <K,V> {}
 * 		example: public interface List<E> extends Collection<E> {}
 * Naming Enums
 * 		All upper-case letters
 * 		example: enum Direction {NORTH, EAST, SOUTH, WEST}
 * Naming Annotations
 * 		First letter of every word should be upper-case
 * 		example: public @interface FunctionalInterface {}
 * 		example: public @interface Test Documented {}
 */
//Java Classes and Objects
/*
 * 
 */
}