package spring;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface Mapper {
	
	@Select("SELECT * FROM person")
    public List<String>[] selectAllPerson();
   
	@Select("SELECT * FROM person WHERE id = #{id}")
    public List<String> selectPerson(@Param("id") int id);
   
	@Insert("INSERT INTO person (firstname, secondname) VALUES (#{fname},#{sname)")
    public int insertPerson(List<String> a);
}
