package javalessons.HW1;

public class JavaLessons1_1 {
	public static void main( String [] args)
	{
		System.out.println("test");
	}
}

//Java Basics 6.1
/*
Installing Java Notes
	Creating system environment variables on Windows 10
		setx command (cmd)
			Use setx command to create user environment variables
				Use the /M flag after setx to create system environment variables
				example: setx /M JAVA_HOME "C:\Program Files\Java"
				example: setx /M MAVEN_HOME "C:\Program Files\apache-maven-3.8.6\bin"
			Use the setx command to edit the PATH system environment variable
				Use the /M flag to edit the System PATH enviro var
				example: setx /M PATH "%PATH%;%JAVA_HOME%;%MAVEN_HOME"
				example: setx /M PATH "%PATH%;C:\your\path\here\"
				QuickNote: separate multiple paths using semicolon
		pwd command (bash)
			Use pwd to find what current directory you are in
			example: pwd
			/c/Users/maksy
		cd command (cmd)
			Use cd to find what current directory you are in
			Use cd .. to go back a directory
			Use cd . (and tab) to see all hidden files
			Use cd /directory to change directories
		echo command (cmd)
			Use echo to values of variables
			example: echo %JAVA_HOME%
			C:\Program Files\Java
		java -version command
			Use java -version to check if java/app was installed
	
	Using Maven
		Must have JAVA_HOME variable set correctly
		Navigate to active directory
		mvn package command
			creates a jar file w/ a snapshot of current project
		mvn install command
			creates file directory of current project
	
	Using Github
		git init command
			initializes a git repo at current directory
		git add command
			adds a folder to monitor for current repo
		git status
			checks for differences between local and master branch of repo
		git commit 
			add changes to be made from local repo
			will need to add a commit message in text editor (press insert key)
				to quit out of a editor/viewer use ":wq"
			git commit 

*/			