class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }
        int windowSize = s1.length();

        for (int i = 0; i <= s2.length() - windowSize; i++) {

            int[] windowFreq = new int[26];
            for (int j = 0; j < windowSize; j++) {
                char ch = s2.charAt(i + j);
                windowFreq[ch - 'a']++;
            }

            if (isFreqSame(freq, windowFreq))
                return true;
        }
        return false;
    }

    private boolean isFreqSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}
