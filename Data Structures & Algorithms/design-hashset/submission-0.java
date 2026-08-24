class MyHashSet {
    private boolean[] memory;

    public MyHashSet() {
        memory = new boolean[1_000_001];
    }
    
    public void add(int key) {
        memory[key] = true;
    }
    
    public void remove(int key) {
        memory[key] = false;
    }
    
    public boolean contains(int key) {
        return memory[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */