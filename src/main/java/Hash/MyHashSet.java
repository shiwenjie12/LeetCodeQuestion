package Hash;

public class MyHashSet {

    /** Initialize your data structure here. */
    int[] data = new int[1000000];
    public MyHashSet() {
    }

    public void add(int key) {
        data[key]=1;
    }

    public void remove(int key) {
        data[key]=0;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(data[key]==1){
            return true;
        }else {
            return false;
        }
    }
}
