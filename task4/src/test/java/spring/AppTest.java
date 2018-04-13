package spring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest
{
	Reverse revObj;
	Processor processObj;
	AnnotationConfigApplicationContext cxt;
	Reader readObj;
	@Before
	public void before() throws Exception{
		cxt = new AnnotationConfigApplicationContext(AppConfig.class);
		revObj=cxt.getBean(Reverse.class);
	}
    @Test
    public void checkMakePalindrome()
    {
    	processObj = cxt.getBean(MakePalindrome.class);
    	String s2= processObj.process("hey");
        String s1="heyyeh";
        assertEquals(s1,s2);
    }
    @Test
    public void checkReverseString()
    {
    	processObj = cxt.getBean(ReverseString.class);
        String s1="hey",s2="yeh";
        String s3=processObj.process(s1);
        assertEquals(s2,s3);
    }
    @Test
    public void checkFileRead()
    {
        readObj = cxt.getBean(FileRead.class);
        String s1="hey";
        String s2=readObj.readString();
        assertEquals(s2,s1);
    }
    @Test
    public void checkReverse()
    {
    	String s1="hey",s3="yeh";
        String s2=revObj.reverse(s1);
        assertEquals(s2,s3);
    }
    @Test
    public void checkDatabaseRead()
    {
    	readObj = cxt.getBean(DatabaseRead.class);
    	String s1="shubham bansal";
        String s2=readObj.readString();
        assertEquals(s2,s1);
    }
}
