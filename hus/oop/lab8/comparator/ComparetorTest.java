package hus.oop.lab8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparetorTest {

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Back", 8.0, 1985));
        System.out.println("Sorted by name:");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        nameCompare.printMovieo(list);
        System.out.println("Sorted by rating:");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        ratingCompare.printMovieo(list);
        System.out.println("Sorted by year:");
        YearCompare yearCompare = new YearCompare();
        Collections.sort(list, yearCompare);
        yearCompare.printMovieo(list);
    }
}
