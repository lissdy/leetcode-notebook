package easy

type MyHashMap struct {
	table [1000000]int
}


/** Initialize your data structure here. */
func Constructor() MyHashMap {
	myHash := &MyHashMap{}
	for index, _ := range myHash.table {
		myHash.table[index] = -1
	}
	return *myHash
}


/** value will always be non-negative. */
func (this *MyHashMap) Put(key int, value int)  {
	this.table[key] = value
}


/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
func (this *MyHashMap) Get(key int) int {
	return this.table[key]
}


/** Removes the mapping of the specified value key if this map contains a mapping for the key */
func (this *MyHashMap) Remove(key int)  {
	this.table[key] = -1
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Put(key,value);
 * param_2 := obj.Get(key);
 * obj.Remove(key);
 */