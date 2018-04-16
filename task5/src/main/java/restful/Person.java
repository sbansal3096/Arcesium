package restful;

public class Person {
	private int id;
	private String fname;
	private String sname;
	
	public Person(int id, String firstname, String secondname)
	{
		this.id=id;
		this.fname=firstname;
		this.sname=secondname;
	}
	public String getSname()
	{
		return this.sname;
	}
	public String getFname()
	{
		return this.fname;
	}
	public int getId()
	{
		return this.id;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setId(int id)
	{
		this.id=id;
	}
}
