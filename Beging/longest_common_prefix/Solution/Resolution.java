package Beging.longest_common_prefix.Solution;

import java.util.Arrays;

public class Resolution {
    public String getLogestCommonPrefix(String[] words) {
        if (words.length == 1)
            return words[0];
        Arrays.sort(words);
        String firstWord = words[0];
        String lasttWord = words[words.length - 1];
        StringBuilder longestPrefix = new StringBuilder();
        for (int i = 0; i < Math.min(firstWord.length(), lasttWord.length()); i++) {
            if (lasttWord.charAt(i) == firstWord.charAt(i)) {
                longestPrefix.append(lasttWord.charAt(i));
            } else {
                break;
            }
        }
        return longestPrefix.toString();
    }

}
