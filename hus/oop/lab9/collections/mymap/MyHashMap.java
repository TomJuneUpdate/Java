package hus.oop.lab9.collections.mymap;

public class MyHashMap implements MyMap {
    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    public MyHashMap() {
        this.table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return null;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        if (size == 0) {
            return;
        }
        int bucket = getBucket(key);
        table[bucket] = null;
        size--;
    }

    @Override
    public boolean contains(Object key) {
        int bucket = getBucket(key);
        MyHashMapEntry entry = table[bucket];
        for (MyHashMapEntry element : table) {
            if (entry != null && entry.getKey().equals(key))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null)
                sb.append(String.format("[bucket %d] -> null\n", i));
            else
                sb.append(String.format("[bucket %d] -> (%s,%s)\n", i, table[i].getKey(), table[i].getValue()));
        }
        return sb.toString();
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] newHashMap = new MyHashMapEntry[INITIAL_SIZE * 2];
        System.arraycopy(table, 0, newHashMap, 0, size);
        this.table = newHashMap;
    }
}
