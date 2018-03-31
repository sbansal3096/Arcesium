package spring;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("consoleRead")
public class ConsoleRead implements ReaderInterface
{
	public String readString(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s="";
        try{
        		s = br.readLine();
        	}catch(IOException e){
        		e.printStackTrace();
        	}
        return s;
	}
}	