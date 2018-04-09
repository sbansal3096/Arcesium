package spring;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("default")
public class ReverseString implements Processor
{
	Reverse reverseObj;
	
	@Inject
	public ReverseString(Reverse reverseObj) {
		this.reverseObj=reverseObj;
	}
	
	@Override
	public String process (String s){
		return reverseObj.reverse(s);
	}
}