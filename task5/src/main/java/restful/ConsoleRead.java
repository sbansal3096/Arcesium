package restful;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.stereotype.Component;

@Component("consoleRead")
public class ConsoleRead implements Reader
{
	@Override
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