package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Bean.xml");
        ProcessorInterface processObj = (ProcessorInterface) appContext.getBean("palindrome");
        Writer writeObj = new Writer();
        String str= processObj.process();
        writeObj.writeString(str);
        ((ClassPathXmlApplicationContext) appContext).close();
    }
}