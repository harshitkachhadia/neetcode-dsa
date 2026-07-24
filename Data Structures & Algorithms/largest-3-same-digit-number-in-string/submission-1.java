 class Solution {
    public String largestGoodInteger(String num) {
        char max = 0; // '\0'

        for(int i = 0; i < num.length() - 2; i++){
            char c = num.charAt(i);
            if(c == num.charAt(i + 1) && c == num.charAt(i + 2)){
                if(c > max){
                    max = c;
                }
            }
        }

        // if not found any contiguous sequence of characters
        if(max == 0){
            return "";
        }
        
        // for character concatenate leading with ""
        return "" + max + max + max;
    }
}