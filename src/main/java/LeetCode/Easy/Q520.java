package LeetCode.Easy;

public class Q520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z][a-z]*|[A-Z]*|[a-z]*");

    }
}
