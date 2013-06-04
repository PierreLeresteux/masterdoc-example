package fr.pierre.api.resource;

import fr.pierre.api.dto.Movie;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

public interface IMovieResource {
	@GET
	List<Movie> getMovies();

	@GET
	@Path("/{id}")
	Movie getMovie(@PathParam("id") Integer id);

	@POST
	@Path("/{id}")
	Movie updateMovie(@PathParam("id") Integer id, Movie movie);
}
