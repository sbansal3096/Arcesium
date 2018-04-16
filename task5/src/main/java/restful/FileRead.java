package restful;

import java.io.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileRead")
@Qualifier("default")
public class FileRead implements Reader
{
	@Override
	public String readString(){
                File file = new File("/home/shubham/arcesium/task5/src/main/resources/in.txt");
		String s="";
                try{
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        s = br.readLine();
                        br.close();
        	}catch(IOException e){
        		e.printStackTrace();
        	}
        return s;
	}
}