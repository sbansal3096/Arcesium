package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
        MakePalindrome processObj = appContext.getBean("palindrome",MakePalindrome.class);
        Writer writeObj = new Writer();
        String str= processObj.process();
        writeObj.writeString(str);
        ((AnnotationConfigApplicationContext) appContext).close();
    }
}