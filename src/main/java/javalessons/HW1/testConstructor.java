package javalessons.HW1;

public class testConstructor extends JavaLessons1_1 
{
	int testNumber;
	String testWord;
	public testConstructor(int testNumber, String testParam2)
	{
		this.testNumber = testNumber;
		testWord = testParam2;
	}
	public int getTestNum()
	{
		return testNumber;
	}
	public String getTestString()
	{
		return testWord;
	}
	public int getThisTestNum()
	{
		return this.testNumber;
	}
}
