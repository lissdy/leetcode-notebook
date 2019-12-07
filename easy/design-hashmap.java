class MyHashMap {
    int[] table;
    /** Initialize your data structure here. */
    public MyHashMap() {
        table = new int[1000000];
        Arrays.fill(table, -1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        table[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return table[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        table[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */