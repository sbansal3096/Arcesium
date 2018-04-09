package spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Processor processObj;
    	Reader readObj;
        Writer writeObj;
        
    	Integer selector;
		Scanner in = new Scanner(System.in);
		System.out.println("Select the appropriate option - \n1) Console Reader \n2) File Read \n3) Database Read \n4) Database Read all");
		selector = in.nextInt();
		
		switch (selector) {
		case 1:
			readObj = appContext.getBean(ConsoleRead.class);
			writeObj = appContext.getBean(ConsoleWrite.class);;
			break;
		case 2:
			readObj = appContext.getBean(FileRead.class);
			writeObj = appContext.getBean(ConsoleWrite.class);
			break;
		case 3:
			readObj = appContext.getBean(DatabaseRead.class);
			writeObj = appContext.getBean(DatabaseWrite.class);
			break;
		case 4:
			readObj = appContext.getBean(DatabaseRead.class);
			List<Person> lp=((DatabaseRead) readObj).readPersonAll();
			writeObj = appContext.getBean(DatabaseWrite.class);
			((DatabaseWrite) writeObj).writeAllPerson(lp);
			break;
		default:
			System.out.println("Invalid selection");
			readObj = appContext.getBean(FileRead.class);
			writeObj = appContext.getBean(ConsoleWrite.class);
	}
		System.out.println("Select the appropriate option - \n1) Reverse String \n2) Make Palindrome");
		selector = in.nextInt();
		
		switch (selector) {
			case 1:
				processObj = appContext.getBean(ReverseString.class);
				break;
			case 2:
				processObj = appContext.getBean(MakePalindrome.class);
				break;
			default:
				System.out.println("Invalid selection");
				processObj = appContext.getBean(ReverseString.class);
		}
		
    	String s=readObj.readString();
        String s2=processObj.process(s);
        writeObj.writeString(s2);
        ((AnnotationConfigApplicationContext) appContext).close();
    }
}