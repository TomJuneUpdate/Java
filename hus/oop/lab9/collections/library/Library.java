package hus.oop.lab9.collections.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getRents() {
        int indexOfLongestRent = 0;
        long longestRent = 0;
        for (int i = 0; i < this.rents.length; i++) {
            long beginDay = rents[i].getBegin().getTime();
            long endDay = rents[i].getEnd().getTime();
            long noOfDaysBetween = endDay - beginDay;
            if (longestRent < noOfDaysBetween) {
                indexOfLongestRent = i;
                longestRent = noOfDaysBetween;
            }
        }

        return rents[indexOfLongestRent];
    }
}
