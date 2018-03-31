package spring;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{
    @Test
    public void checkMakePalindrome()
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("Bean.xml");
        ProcessorInterface processObj = (ProcessorInterface) appContext.getBean("palindrome");
        String s2= processObj.process();
        String s1="heyyeh";
        assertEquals(s1,s2);
        ((ClassPathXmlApplicationContext) appContext).close();
    }
    @Test
    public void checkReverseString()
    {
        ReverseString obj = new ReverseString();
        String s1="hey",s2="yeh";
        String s3=obj.reverse(s1);
        assertEquals(s2,s3);
    }
    @Test
    public void checkFileRead()
    {
        FileRead obj = new FileRead();
        String s1="hey";
        String s2=obj.readString();
        assertEquals(s2,s1);
    }
}
