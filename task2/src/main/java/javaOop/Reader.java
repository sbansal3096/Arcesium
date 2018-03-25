package javaOop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader
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