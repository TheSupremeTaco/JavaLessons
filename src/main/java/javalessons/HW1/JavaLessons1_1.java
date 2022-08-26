package javalessons.HW1;

public class JavaLessons1_1 {
	public static void main( String [] args)
	{
		//testConstructor();
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
 * Difference between Objects and Classes
 * 		Classes are templates that describe the state and behavior of its objects, objects
 * 		represent actions in the system/application 
 * Declaring a Class 
 * 		example:
 * 				<<modifiers>> class <<class name>> {
 * 				}
 * 		Class declaration may have zero/or more modifiers
 * 		example:
 * 				public class Main
 * 				{
 * 					//Body of class
 * 				}
 * 		Class Types: abstract, non-abstract
 * 			Abstract classes are incomplete classes, can't create instances, can extend to complete
 * 			their specifications
 * 			Non-Abstract classes are defined full state and behavior, can create instances of class
 * 	Components of Java Classes: Fields, Methods, Constructors, Static Initializers, Instance Initializers
 * 		FIELDS are properties of a objects of the class
 * 			General Syntax:
 * 				public class Main
 * 				{
 * 					<<modifiers>> <<data type>> <<field name>> = <<initial value>>;
 * 				}
 * 			example:	
 * 				public class Human
 * 				{
 * 					String name;
 * 					String gender;
 *	 			}
 * 		
 * 		METHODS/FUNCTIONS is a collection of statement grouped together	
 * 			Accepts as many to zero arguments, returns void or a SINGLE value, can be overloaded, and override
 * 			example:
 * 				public class Human 
 * 				{
 * 					String name;
 * 					String gender;
 * 					
 * 					public void eat()
 * 					{
 * 
 * 						System.out.println("I am eating");
 * 					}
 * 				}
 * 		CONSTRUCTORS
 * 				Named block of code used to initialize an object immediately after object created
 * 				example:
 * 					<<Modifiers>> <<Constructors Name>>(<<parameters list>>) throws <<Exception list>>
 * 					{
 * 						//Body of constructor
 * 					}
 * 				Constructor modifiers: public, private, protected, or package-level (no modifier)
 * 				Constructors do not have a return type
 * 		INITIALIZATION BLOCKS
 * 			Block of code outside of methods or constructors in a class w/o a name
 * 		EXAMPLE
 * 			Main.java
 * 
 * 			public class Main
 * 			{
 * 
 * 				//instance initializer
 * 				{
 * 					System.out.println("Inside instance initializer");
 * 				}
 * 			
 * 				//constructor
 * 				public Main()
 * 				{
 * 					System.out.println("Inside constructor");
 * 				}	
 * 			
 * 				public static void main(String[] args)
 * 				{
 * 					new Main();
 * 				}
 * 			}
 * 			Output:
 * 			
 * 			Inside instance initializer
 * 			Inside constructor		
 * 		STATIC INITIALIZATION BLOCK
 * 			Initialize a class and happens once per class, happens before instance initializer, multiple possible
 * 		EXAMPLE
 * 			Main.java
 * 
 * 			public class Main
 * 			{
 * 
 * 				//static initializer
 * 				static {
 * 					System.out.println("Inside static initializer");
 * 				}
 * 			
 * 				//constructor
 * 				public Main()
 * 				{
 * 					System.out.println("Inside constructor");
 * 				}	
 * 			
 * 				public static void main(String[] args)
 * 				{
 * 					new Main();
 * 				}
 * 			}
 * 			Output:
 * 			
 * 			Inside static initializer
 * 			Inside constructor
 * 		CREATING JAVA OBJECTS
 * 			Use "new" keyword along with a constructor
 * 			example:
 * 				<<Class>> <<variables>> = new <<Call to Class Constructor>>;
 * 			example:
 * 				Human human = new Human();
 * 		NULL REFERENCE
 * 			Used for reference type variable to reference no object
 * 			example:
 * 				Human john = null; //john is not refer to an object
 * 				john = new Human(); //john is referring to a valid Human object
 * 			null references cannot be used for primitive type variables (can't compare primitive to null type)
 */
	//constructor practice
	// this quick note: .this refers to current reference in constructor, this(..) refers to current reference w/ constructor overloading
	static void testConstructor()
	{
		testConstructor testConstruct1 = new testConstructor(1, "test");
		System.out.println(testConstruct1.getTestNum());
		System.out.println(testConstruct1.getThisTestNum());
		System.out.println(testConstruct1.getTestString());
		System.out.println("Seperator");
	}
/*
 * JAVA PASS-BY-VALUE vs. PASS-BY-REFERENCE
 * 		When passing a object and you want to change its value you need to use a modifier
 * 		method from the constructor's class, otherwise you're changing the tmp variables reference
 * 		Refer to this link for graphic explanation https://howtodoinjava.com/java/basics/java-is-pass-by-value-lets-see-how/
 */
/*
 * JAVA main() METHOD
 * 		example:
 * 			public class Main
 * 			{
 * 				public static void main(String[] args)
 * 				{
 * 					System.out.println("Hello World !!")
 * 				}
 * 			}
 * 			Why Java main Method is public
 * 				So the main method is accessible anywhere, it won't run if you don't match this
 * 				syntax : "public static void main(String[] args)"
 * 			Why static
 * 				Can access the method without needing to create a class object
 * 			Why void
 * 				main() method doesn't need to return any values
 * 			Why main
 * 				industry standard
 */
/*
 * JAVA KEYWORDS
 * 		Just don't use any of the 50 reserved words for variables, classes, methods, etc names
 */
/*
 * JAVA OPERATORS 
 * 		Three Main Types
 * 			Unary: one operand, binary: two operand, ternary: three operands
 * 		Assignment Operator (=)
 * 			Assigns values to a variable, take two operands
 * 			example:	int count = 26;
 * 		Arithmetic Operators (+,-,*,/)
 * 			Only work with numeric type operands, does arithmetic
 * 			For full list of Unary/Binary arithmetic operators check online documentation
 * 		String Concatenation Operator
 * 			Concatenate (adds/converts) two strings
 * 			example: String str3 = "Hello" + "World";
 * 			Concatenates primitive to string
 * 			example: String str2 = 26 + "Alphabets"
 * 			Concatenate null with string
 * 			example: String str3 = "I am " + null;
 * 		Relational Operators (==,!=,<,>,>=,<=)
 * 			Produces a boolean value of true or false
 * 			example: if (20 > 10)
 * 		Boolean Logical Operators (!,&&,&,||,|,^,!=,^=)
 * 			used for logic, come-on this is something you learned earlier lol
 * 			example: (20 > 10 && 20 < 20)
 * 		Bitwise Operators
 * 			manipulates individual bits of its operands
 * 			look at documentation for full list
 * 		Ternary Operator (?,:)
 * 			Takes three operands
 * 			If boolean-expression evaluates to true it gives the true-expression otherwise
 * 			gives the false expression
 * 			example: 
 * 				int number1 = 20;
 * 				int number2 = 40;
 * 				int biggerNumber = (number1 > number2) ? number1 : number2
 * 				//Compares both numbers and returns which one is bigger
 * 		Java Operator Precedence Table
 * 			Just check the documentation
 */
/*
 * Java Data Types
 * 		Variable Declarations
 * 			Variable name: refers to memory location
 * 			Variable Type: refers to the type stored at memory location
 * 			Memory location: holds the value of variable 
 * 		Data Types
 * 			Primitive Data Types
 * 				Directly holds a value in memory, not objects, no references, valued stored in
 * 				primitives are referred as literals
 * 				Type conversion between primitives
 * 					Can assign primitive values to another primitive type, but can occur data loss
 * 					example:
 * 						int counter = 20_000_000;
 * 						short shortCounter = (short) counter;
 * 					Quick tip for data conversions: when java detects a conversion may result
 * 					in data loss it gives a type-mismatch error and asks for type casting
 * 					Type-Casting: (short) counter;
 * 			Non-Primitive Data Type
 * 				Holds reference to an object in memory, using reference to access the fields and
 * 				methods of the referenced object
 * 				Can refer multiple variables to the same object in memory
 * 			Wrapper Class
 * 				is a class whose object wraps/contains primitive data types
 * 				Types of wrapper classes names (Boolean, Byte, Short, Character, Integer, Long, Float,
 * 				and Double)
 * 			Auto-boxing
 * 				Assigning a primitive type to a wrapper class directly
 * 				example: Integer counter = 20; static Float PI = 3.14f;
 * 				Quick-Note: wrapper class instances are immutable (can't be changed after made)
 * 			BEST PRACTICES
 * 				Use primitives for local scope and non-primitive when data is transfered between 
 * 				classes or methods (creates less memory overhead, just passes reference:no pass-by-value
 * 				copy in memory)
 * 				Collection will always use objects, not primitives
 * 				While sending data over network, use objects and make them serializable(wrapper classes are
 * 				automatically serializable)
 * 				Use appropriate data sizing to save memory 
 * 				Use underscores in numbers to make them more readable example: int i = 1_000_000
 */
/*
 * Java Primitive Types
 * 	INTEGRAL DATA TYPES
 * 		int type
 * 			32-signed java primitive data type
 * 			Integer Wrapper Class
 * 				defines twc constants to represent maximum and minimum values for int data type
 * 				example: int max = Integer.MAX_VALUE;
 * 		long type
 * 			64-bit signed java primitive data type
 * 			Type casting: type casting from long to int example: long num1 = (int) num2;
 * 			Long Wrapper Class
 * 				same as Integer(Long.MAX_VALUE // Long.MIN_VALUE;
 * 		Byte type
 * 			8-bit signed java data type, no byte literals
 * 			Byte Wrapper Class
 * 				same as Integer(Byte.MAX_VALUE // Byte.MIN_VALUE;
 * 		Short type
 * 			16-bit signed java primitive data type
 * 			Short Wrapper Class
 * 				same as Integer(Short.MAX_VALUE // Short.MIN_VALUE;
 * 		Char data type
 * 			16-bit UNSIGNED java primitive data type
 * 			example: char c1= 'A';
 * 			CHARACTER ESCAPE SEQUENCES
 * 				\n : line feed
 * 				\r : carriage return
 * 				\f : form feed
 * 				\b : backspace
 * 				\t : tab
 * 				\\ : backslash
 * 				\" : double quote
 * 				\' : single quote
 * 				\u0041 : unicode escape sequence
 * 				example: char c2 = '\u0041'; //same as c2 = 'A'
 * 		Float type
 * 			32 bit to store floating-point
 * 		Double type
 * 			64 bit to store floating-point number
 * 		Boolean type
 * 			true or false boolean literal values
 * 			example: boolean done = true;
 */
/*
 * 
 */
}
