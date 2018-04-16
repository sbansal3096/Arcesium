package restful;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("default")
@Path("reverse/{s}")
public class ReverseString implements Processor
{
	Reverse reverseObj;
	
	@Inject
	public ReverseString(Reverse reverseObj) {
		this.reverseObj=reverseObj;
	}
	
	@Override
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String process (@PathParam("s")String s){
		return reverseObj.reverse(s);
	}
}