package com.eason.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eason.response.User;

/**
 *
 * @author Eason Lin
 *
 */
@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  User SayHello() {
		User user = new User("eason lin", "hello world !!");
		return user;
	}


}
