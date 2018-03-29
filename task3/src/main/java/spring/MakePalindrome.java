package spring;

public class MakePalindrome implements ProcessorInterface
{
	public String process(String s){
 		StringBuilder s1 = new StringBuilder();
 		ReverseString processObj = new ReverseString();
 		s1.append(s);
 		String s2 = processObj.process(s);
 		s1.append(s2);
 		return s1.toString();
	}
}