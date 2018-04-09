package spring;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest
{
    @Test
    public void checkMakePalindrome()
    {
    	AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
        MakePalindrome processObj = appContext.getBean(MakePalindrome.class);
        String s2= processObj.process("hey");
        String s1="heyyeh";
        assertEquals(s1,s2);
        ((AnnotationConfigApplicationContext) appContext).close();
    }
    @Test
    public void checkReverseString()
    {
    	Reverse r=new Reverse();
        ReverseString obj = new ReverseString(r);
        String s1="hey",s2="yeh";
        String s3=obj.process(s1);
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
    @Test
    public void checkReverse()
    {
    	Reverse obj= new Reverse();
    	String s1="hey",s3="yeh";
        String s2=obj.reverse(s1);
        assertEquals(s2,s3);
    }
    @Test
    public void checkDatabaseRead()
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Reader obj = context.getBean(DatabaseRead.class);
    	String s1="shubham bansal";
        String s2=obj.readString();
        assertEquals(s2,s1);
    }
}
