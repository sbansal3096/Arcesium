package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        FileRead readObj = new FileRead();
        //ConsoleRead readObj = new ConsoleRead();
        ApplicationContext appContext = new ClassPathXmlApplicationContext("/home/shubham/arcesium/task3_spring/src/main/java/Bean.xml");
        ProcessorInterface processObj1 = (ProcessorInterface) appContext.getBean("palindrome");
        Writer writeObj = new Writer();
        String str = readObj.readString();
        str = processObj1.process(str);
        writeObj.writeString(str);
    }
}