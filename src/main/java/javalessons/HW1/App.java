package javalessons.HW1;
import java.util.ArrayList;
import java.util.HashSet;

public class App 
{
    public static void main( String[] args )
    {
    	//Array used for illustrating each collection type
    	String[] programLangs = {"Java","JavaScript","C","C++","C#","Python"};
        printStatement("List Demo");
        listDemo(programLangs);
        System.out.print("\n");
        
        setDemo(programLangs);
    }
    
    static void printStatement(String inputString)
    {
    	System.out.println(inputString);
    }
    
    static void listDemo(String[] programLangs)
    {
    	ArrayList<String> progLangs = new ArrayList<String>();
    	for (int i=0; i<programLangs.length; i++) progLangs.add(programLangs[i]);
    	System.out.println(progLangs);
    	
    	// Using methods from the ArrayList object
    	for (int i = 0; i < progLangs.size();i++)
    	{
    		System.out.println("The " + i + " language in the ArrayList is:" + progLangs.get(i));
    	}
    	// Unlike arrays, ArrayList objects can change sizes
    	progLangs.add("Ruby");
    	System.out.println(progLangs);
    }
    
    static void setDemo(String [] programLangs)
    {
    	HashSet<String> setPrograms = new HashSet<String>();
    	
    	
    }
    
    
}
