class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        for (String word : words) {
            int[] count = new int[26];
            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans += word.length();
            }
        }

        return ans;
    }
}