package spring;

import java.util.stream.Collectors;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("databaseRead")
public class DatabaseRead implements Reader{
		@Autowired
		private Mapper mapper;
	  
	  /*@Inject
	  public void setString(Mapper mapper)
	  {
		  this.mapper=mapper;
	  }*/
	  
	 
	  
	@Override
	public String readString() {
		  
		return mapper.selectPerson(0).stream().collect(Collectors.joining(" "));
	}

}
