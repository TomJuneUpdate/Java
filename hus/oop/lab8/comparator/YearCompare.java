package hus.oop.lab8.comparator;

import java.util.*;

public class YearCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.getYear() - right.getYear();
    }
    public void printMovieo(List<Movie> movies) {
        for (Movie movieElement : movies) {
            System.out.println(movieElement);
        }
    }

}
