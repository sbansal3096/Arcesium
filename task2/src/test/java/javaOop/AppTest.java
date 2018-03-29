package javaOop;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void test()
    {
        Processor processObj = new Processor();
        String s1="hello",s2="olleh";
        String s3=processObj.reverseString(s1);
        assertEquals(s2,s3);
    }
}
