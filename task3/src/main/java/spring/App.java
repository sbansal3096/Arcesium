package spring;

public class App 
{
    public static void main( String[] args )
    {
        FileRead readObj = new FileRead();
        //ConsoleRead readObj = new ConsoleRead();
        MakePalindrome processObj = new MakePalindrome();
        Writer writeObj = new Writer();
        String str = readObj.readString();
        str = processObj.process(str);
        writeObj.writeString(str);
    }
}