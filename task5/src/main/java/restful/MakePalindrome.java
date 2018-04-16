package restful;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Path("palindrome/{s}")
public class MakePalindrome implements Processor
{
	Reverse reverseObj;
	final Logger logger = LogManager.getLogger(App.class);
	
	@Inject
	public MakePalindrome(Reverse reverseObj) {
		this.reverseObj=reverseObj;
	}
	
	@Override
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String process(@PathParam("s")String s){
 		StringBuilder s1 = new StringBuilder();
 		s1.append(s);
 		String s2 = reverseObj.reverse(s);
 		logger.debug(s);
 		s1.append(s2);
 		return s1.toString();
	}
}