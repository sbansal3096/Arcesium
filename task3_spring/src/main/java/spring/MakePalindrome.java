package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("palindrome")
public class MakePalindrome implements ProcessorInterface
{
	@Autowired (required=true)
    @Qualifier ("default")
	ReaderInterface readObj;
	
	@Autowired(required=true)
	@Qualifier ("reverse")
	ReverseString reverseObj;
	
	public String process(){
		String s = readObj.readString();
 		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		String s2 = reverseObj.reverse(s);
 		s1.append(s2);
 		return s1.toString();
	}
}