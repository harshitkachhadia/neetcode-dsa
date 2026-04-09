class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create HashMap to store elements and its freq
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // Create PQ with Min Heap Structure
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int key:map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
                // It will dequeue small freq elements first as we declare Min Heap - Priority Queue
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
