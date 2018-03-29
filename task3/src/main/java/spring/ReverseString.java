package spring;

public class ReverseString implements ProcessorInterface
{
	public String process(String s){

		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		s1 = s1.reverse();
        return s1.toString();
	}
}