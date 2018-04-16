package restful;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component("databaseRead")
public class DatabaseRead implements Reader{
	
	private PersonSql obj;
	  
	  @Inject
	  public DatabaseRead(PersonSql obj)
	  {
		  this.obj=obj;
	  }
	  
	@Override
	public String readString() {
		Person p=obj.selectPerson(1);
		return p.getFname()+" "+p.getSname();
	}
	
	public List<Person> readPersonAll(){
		return obj.selectAllPerson();
	}

}
