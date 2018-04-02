package spring;

import org.springframework.stereotype.Component;

@Component
public class Writer implements WriterInterface
{
	public void writeString(String s){
		System.out.println(s);
	}
}