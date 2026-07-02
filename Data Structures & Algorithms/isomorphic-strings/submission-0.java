class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char chS = s.charAt(i);
            char chT = t.charAt(i);


            // s -> t Mapping
            if(mapST.containsKey(chS)){
                if(mapST.get(chS) != chT){
                    return false;
                }
            } else {
                mapST.put(chS,chT);
            }

            // t -> s Mapping
            if(mapTS.containsKey(chT)){
                if(mapTS.get(chT) != chS){
                    return false;
                }
            } else {
                mapTS.put(chT,chS);
            }
        }

        return true;
    }
}