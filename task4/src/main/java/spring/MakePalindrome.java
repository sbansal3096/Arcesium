package spring;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MakePalindrome implements Processor
{
	Reader readObj;
	ReverseString reverseObj;

	@Inject
	@Qualifier("default")
	public void setM(Reader readObj, ReverseString reverseObj) {
		this.readObj=readObj;
		this.reverseObj=reverseObj;
	}
	
	@Override
	public String process(){
		String s = readObj.readString();
 		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		String s2 = reverseObj.reverse(s);
 		s1.append(s2);
 		return s1.toString();
	}
}