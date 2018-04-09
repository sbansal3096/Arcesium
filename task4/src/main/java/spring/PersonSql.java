package spring;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface PersonSql {
	
	@Select("SELECT * FROM person")
    public List<Person> selectAllPerson();
   
	@Select("SELECT * FROM person WHERE id = #{id}")
    public Person selectPerson(@Param("id") int id);
   
	@Insert("INSERT INTO person (firstname, secondname) VALUES (#{fname},#{sname});")
    public int insertPerson(Person p);
	
	 @Insert({"<script>", 
	        "INSERT INTO  person (firstname,secondname) VALUES ",
	        "<foreach collection='collection' item='p' index='index' separator = ',' >(#{p.fname},#{p.sname})</foreach>",
	        "</script>"})
	 public int insertAllPerson(@Param("collection") List<Person> collection);
}
