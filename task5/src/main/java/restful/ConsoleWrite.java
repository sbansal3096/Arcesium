package restful;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWrite implements Writer
{
	@Override
	public void writeString(String s){
		System.out.println(s);
	}
}