package hus.oop.lab8.comparable;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;


    @Override
    public int compareTo(Movie orther) {
        return orther.name.compareTo(this.name);
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie[" + "name='" + name + '\'' + ", rating=" + rating + ", year=" + year + ']';
    }
}
