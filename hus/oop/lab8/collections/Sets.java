package hus.oop.lab8.collections;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer firstElement : first) {
                if (second.contains(firstElement)) {
                    result.add(firstElement);
            }
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        for (int element : second) {
            first.add(element);
        }
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        return new ArrayList<>(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            for (int j = i + 1; j < source.size() - 1; j++) {
                if (source.get(i).equals(source.get(j))) {
                    source.remove(j);
                }
            }
        }

        return source;
    }

    public static String firstRecurringCharacter(String agr) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < agr.length(); i++) {
            characterSet.add(agr.charAt(i));
        }
        List<Character> characterList = new ArrayList<>(characterSet);
        return characterList.get(0).toString();
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }
        return characterSet;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        System.out.println(intersectionManual(set1, set2));
    }
}