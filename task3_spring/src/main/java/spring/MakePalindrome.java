package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("palindrome")
public class MakePalindrome implements ProcessorInterface
{
	ReaderInterface readObj;
	ReverseString reverseObj;

	@Autowired(required=true)
	@Qualifier("default")
	public void setM(ReaderInterface readObj, ReverseString reverseObj) {
		this.readObj=readObj;
		this.reverseObj=reverseObj;
	}
	
	public String process(){
		String s = readObj.readString();
 		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		String s2 = reverseObj.reverse(s);
 		s1.append(s2);
 		return s1.toString();
	}
}