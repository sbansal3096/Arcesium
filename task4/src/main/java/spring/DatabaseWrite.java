package spring;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class DatabaseWrite implements Writer{
	private Mapper mapper;
	  
	  @Inject
	  public void setString(Mapper mapper)
	  {
		  this.mapper=mapper;
	  }
	  
	@Override
	public void writeString(String s){

		String[] name = s.split("\\s+");
		Person p = new Person(1,name[0],name[1]);
	/*	p.setFname(name[0]);
		p.setSname(name[1]);*/
		mapper.insertPerson(p);
	}
}
