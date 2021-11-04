package aula1022;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MovieStreamingImpl implements MovieStreaming{

    private List<Movie> movieList;

    public MovieStreamingImpl() {
        movieList = new ArrayList<>();
        for (int i=0;i<(int)(Math.random()*97)+3;i++){
            movieList.add(Movie.generateRandomMovie());
        }
    }

    @Override
    public void getMovie(String name) {

        Movie movie = movieList.stream().filter(e->e.getName().equals(name)).findAny().get();
        JOptionPane.showMessageDialog(null,String.format("""
                Filme: %s
                Link: %s""",
                movie.getName(),
                movie.getUrl()));

    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
