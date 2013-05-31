package fr.pierre.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.pierre.api.dto.Actor;
import fr.pierre.api.dto.Movie;

@Service
public class MovieService {

  public Movie createMovie(Movie movie) {
    movie.setId(1);
    return movie;
  }

  public Movie getMovie(Integer id) {
    return getVeryBadTrip3(id);
  }

  private Movie getVeryBadTrip3(Integer id) {
    Movie movie = new Movie();
    movie.setId(id);
    movie.setTitle("Very Bad Trip 3");
    movie.setDirector("Todd Philips");
    movie.setYear(2013);
    movie.setActors(new ArrayList<Actor>());
    movie.getActors().add(getBCooper());
    movie.getActors().add(getEHelms());
    movie.getActors().add(getZGalifianakis());
    movie.getActors().add(getJBartha());
    return movie;
  }

  private Movie getGatsbyLeMagnifique(Integer id) {
    Movie movie = new Movie();
    movie.setId(id);
    movie.setTitle("Gasby le Magnifique");
    movie.setDirector("Baz Luhrmann");
    movie.setYear(2013);
    movie.setActors(new ArrayList<Actor>());
    movie.getActors().add(getLDiCaprio());
    movie.getActors().add(getTMaGuire());
    return movie;
  }

  private Actor getTMaGuire() {
    Actor actor = new Actor();
    actor.setAge(37);
    actor.setFirstname("Tobias");
    actor.setLastname("Maguire");
    return actor;
  }

  private Actor getLDiCaprio() {
    Actor actor = new Actor();
    actor.setAge(38);
    actor.setFirstname("Léonardo");
    actor.setLastname("Di Caprio");
    return actor;
  }

  private Actor getJBartha() {
    Actor actor = new Actor();
    actor.setAge(34);
    actor.setFirstname("Justin");
    actor.setLastname("Bartha");
    return actor;
  }

  private Actor getZGalifianakis() {
    Actor actor = new Actor();
    actor.setAge(43);
    actor.setFirstname("Zach");
    actor.setLastname("Galifianakis");
    return actor;
  }

  private Actor getEHelms() {
    Actor actor = new Actor();
    actor.setAge(39);
    actor.setFirstname("Ed");
    actor.setLastname("Helms");
    return actor;
  }

  private Actor getBCooper() {
    Actor actor = new Actor();
    actor.setAge(38);
    actor.setFirstname("Bradley");
    actor.setLastname("Cooper");
    return actor;
  }

  public List<Movie> getMovies() {
    List<Movie> movies = new ArrayList<Movie>();
    movies.add(getVeryBadTrip3(1));
    movies.add(getGatsbyLeMagnifique(2));
    return movies;
  }
}
