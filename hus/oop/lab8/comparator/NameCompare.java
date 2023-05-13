package hus.oop.lab8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareToIgnoreCase(right.getName());
    }

    public void printMovieo(List<Movie> movies) {
        for (Movie movieElement : movies) {
            System.out.println(movieElement);
        }
    }

}
