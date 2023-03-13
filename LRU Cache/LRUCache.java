class LRUCache {

    class Pair {
        int key; int value;
        Pair(int k, int v){
            key = k;
            value = v;
        }
    }
    ArrayDeque<Pair> deque;
    Map<Integer,Pair> map;
    int capacity;
    public LRUCache(int capacity) {
        deque = new ArrayDeque<Pair>(capacity);
        map = new HashMap<Integer,Pair>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            deque.removeLastOccurrence(map.get(key));
            deque.addLast(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            deque.removeLastOccurrence(map.get(key));
            map.put(key,new Pair(key,value));
            deque.addLast(map.get(key));
        }
        else{
            if(map.size()==capacity){
                map.remove(deque.getFirst().key);
                deque.removeFirst();
            }
            Pair pair = new Pair(key,value);
            deque.addLast(pair);
            map.put(key,pair);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
