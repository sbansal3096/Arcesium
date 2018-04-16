package restful;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class DatabaseWrite implements Writer{
	
	private PersonSql obj;
	  
	  @Inject
	  public DatabaseWrite(PersonSql obj)
	  {
		  this.obj=obj;
	  }
	  
	@Override
	public void writeString(String s){
		String[] name = s.split("\\s+");
		Person p = new Person(1,name[0],name[1]);
		obj.insertPerson(p);
	}
	
	public void writeAllPerson(List<Person> lp){
		//System.out.println(lp);
		obj.insertAllPerson((List<Person>)lp);
	}
}
