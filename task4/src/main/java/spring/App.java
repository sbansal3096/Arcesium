package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
    	/*ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        Mapper mapper = (Mapper) cxt.getBean("mapper");
       */
    	MakePalindrome processObj = appContext.getBean(MakePalindrome.class);
        Reader readObj = appContext.getBean(DatabaseRead.class);
        String s=readObj.readString();
        Write writeObj = appContext.getBean(Write.class);
        String str= processObj.process();
        writeObj.writeString(str);
        ((AnnotationConfigApplicationContext) appContext).close();
    }
}