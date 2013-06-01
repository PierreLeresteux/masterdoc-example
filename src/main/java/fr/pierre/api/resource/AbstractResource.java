package fr.pierre.api.resource;


import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public class AbstractResource<T> {

	@DELETE
	@Path("/{id}")
	public Response deleteMovie(@PathParam("id") Integer id) {
		return Response.noContent().build();
	}

	@PUT
	public T createMovie(T entity) {
		return entity;
	}
}
