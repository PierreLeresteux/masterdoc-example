package fr.pierre.api.resource;

import fr.pierre.api.dto.Movie;
import fr.pierre.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/movie")
@Produces(APPLICATION_JSON + ";charset=utf-8")
@Consumes(APPLICATION_JSON + ";charset=utf-8")
@Controller
public class MovieResource extends AbstractResource<Movie> implements IMovieResource {

	@Autowired
	private MovieService movieService;

	@GET
	@Override
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}

	@GET
	@Override
	@Path("/{id}")
	public Movie getMovie(@PathParam("id") Integer id) {
		return movieService.getMovie(id);
	}

	@DELETE
	@Override
	@Path("/{id}")
	public Response deleteMovie(@PathParam("id") Integer id) {
		return Response.noContent().build();
	}

	@POST
	@Override
	@Path("/{id}")
	public Movie updateMovie(@PathParam("id") Integer id, Movie movie) {
		return movie;
	}
}
