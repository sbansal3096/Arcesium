package javaOop;

public class App 
{
    public static void main( String[] args )
    {
        Reader readObj = new Reader();
        Processor processObj = new Processor();
        Writer writeObj = new Writer();
        String str = readObj.readString();
        str = processObj.reverseString(str);
        writeObj.writeString(str);
    }
}
