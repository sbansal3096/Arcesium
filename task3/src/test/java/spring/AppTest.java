package spring;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest
{
    @Test
    public void test()
    {
        MakePalindrome processObj = new MakePalindrome();
        String s1="yes",s2="yessey";
        String s3=processObj.process(s1);
        assertEquals(s2,s3);
    }
}
