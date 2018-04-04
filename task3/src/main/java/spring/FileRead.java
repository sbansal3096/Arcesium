package spring;
import java.io.*;

public class FileRead implements ReaderInterface
{
	public String readString(){
                File file = new File("/home/shubham/arcesium/task3/in.txt");
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