class Solution {
    public boolean isAnagram(String s, String t) {
        // if length of two string is not equal , return false
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c: t.toCharArray()){
            // if String s does not contains any Chracter of String t , return false
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c) - 1);
            // if value of (frequency) of any character becomes negative , return false
            if(map.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}
