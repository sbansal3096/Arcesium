package spring;

import java.io.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileRead")
@Qualifier("default")
public class FileRead implements Reader
{
	@Override
	public String readString(){
                File file = new File("/home/shubham/arcesium/task3_spring/in.txt");
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