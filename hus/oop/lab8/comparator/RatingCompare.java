package hus.oop.lab8.comparator;

import java.util.Comparator;
import java.util.List;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        if (left.getRating() < right.getRating()) {
            return -1;
        } else if (left.getRating() < right.getRating()) {
            return 1;
        } else return 0;
    }

    public void printMovieo(List<Movie> movies) {
        for (Movie movieElement : movies) {
            System.out.println(movieElement);
        }
    }
}
