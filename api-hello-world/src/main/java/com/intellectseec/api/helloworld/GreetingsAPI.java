package com.intellectseec.api.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greeting/v1.0/")
public class GreetingsAPI {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}")
	public Response sayHello(@PathParam("name") String name){
		System.out.println(">>>>>> name : " + name);
		String msg = "Hello " + name; 
		return Response.ok(msg).build();
	}
}
