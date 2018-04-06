package spring;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component("databaseRead")
public class DatabaseRead implements Reader{
	
	private Mapper mapper;
	  
	  @Inject
	  public void setString(Mapper mapper)
	  {
		  this.mapper=mapper;
	  }
	  
	@Override
	public String readString() {
		
		Person p=mapper.selectPerson(1);
		return p.getFname()+" "+p.getSname();
	}

}
