package spring;

import org.springframework.stereotype.Component;

@Component
public class Write implements Writer
{
	@Override
	public void writeString(String s){
		System.out.println(s);
	}
}