package spring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("reverse")
@Qualifier("default")
public class ReverseString implements ReverseInterface
{
	public String reverse(String s){

		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		s1 = s1.reverse();
        return s1.toString();
	}
}