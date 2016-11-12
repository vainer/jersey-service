package com.vainerv.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.vainerv.training.model.Employer;

@Path("/hello")
public class RestJerseyTutorialService {

	@GET
	@Path("string/{name}")
	@Produces("application/json")
	public String helloInJson(@PathParam("name") String name) {
		StringBuilder stringBuilder = new StringBuilder("Hello ");
		stringBuilder.append(name).append("!");
		return stringBuilder.toString();
	}

	@GET
	@Path("json/{name}-{lastName}")
	@Produces("application/json")
	public Employer helloEmployer(@PathParam("name") String name, @PathParam("lastName") String lastName) {
		return new Employer(name, lastName);
	}

	@GET
	@Path("text/{name}")
	@Produces("text/html")
	public String helloInPlainText(@PathParam("name") String name) {
		StringBuilder stringBuilder = new StringBuilder("Hello ");
		stringBuilder.append(name).append("!");
		return stringBuilder.toString();
	}

}
