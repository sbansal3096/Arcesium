package spring;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MakePalindrome implements Processor
{
	Reverse reverseObj;
	
	@Inject
	public void setM(Reverse reverseObj) {
		this.reverseObj=reverseObj;
	}
	
	@Override
	public String process(String s){
 		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		String s2 = reverseObj.reverse(s);
 		s1.append(s2);
 		return s1.toString();
	}
}