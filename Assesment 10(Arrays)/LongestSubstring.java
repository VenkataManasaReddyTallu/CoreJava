import java.util.*;
// Longest Substring Without Repeating Characters (Sliding Window)
class LongestSubstring {
    static int longestUniqueSubstring(String s) {
        int[] chars = new int[128];
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            chars[s.charAt(right)]++;
            while (chars[s.charAt(right)] > 1) {
                chars[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest Unique Substring Length: " + longestUniqueSubstring(s));
    }
}
