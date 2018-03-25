package javaOop;

public class Processor
{
	public String reverseString(String s){

		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		s1 = s1.reverse();
        return s1.toString();
	}
}