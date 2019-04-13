package Hash;

public class MyHashMap {
    class Entry {
        int key;
        int value;
    }

    Entry[] entries;
    /** Initialize your data structure here. */
    public MyHashMap() {
        entries = new Entry[1000000];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        Entry entry = new Entry();
        entry.key = key;
        entry.value = value;
        entries[key] = entry;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Entry entry = entries[key];
        if (entry != null){
            return entry.value;
        }else {
            return -1;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        entries[key] = null;
    }
}
