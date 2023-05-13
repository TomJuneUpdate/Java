package hus.oop.lab9.collections.mymap;

import java.util.HashMap;
import java.util.Map;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyMap myMap = new MyHashMap();
        myMap.put(11,"Nicola");
        myMap.put(11,"Nicola");
        myMap.put(21,"Marzia");
        myMap.put(33,"Agata");
        myMap.put(31,"Tom");
        myMap.put(30,"Victor");
        myMap.put(38,"Jena");
        myMap.put(10,"Nicola");
        myMap.put(13,"Nicla");
        myMap.put(23,"Marzia");
        System.out.println(myMap.contains(11));
        System.out.println(myMap.contains(77));
        System.out.println(myMap.size());
        System.out.println(myMap);
        Map map = new HashMap<>();
        map.put(11,"Nicola");
        map.put(11,"Nicola");
        map.put(21,"Marzia");
        map.put(33,"Agata");
        map.put(31,"Tom");
        map.put(30,"Victor");
        map.put(38,"Jena");
        map.put(10,"Nicola");
        map.put(13,"Nicla");
        map.put(23,"Marzia");
        System.out.println(map);
    }
}
