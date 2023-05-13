package hus.oop.lab8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void printMovie(List<Movie> movies) {
        for (Movie movieElement : movies) {
            System.out.println(movieElement);
        }
    }

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Back", 8.0, 1985));
        Collections.sort(list);
        printMovie(list);
    }
}
