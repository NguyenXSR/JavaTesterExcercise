import java.util.ArrayList;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String input) {
        //su dung 2 pointers
        int left = 0;                  // index 0
        int right = input.length() - 1;  // index cuoi n length -1

        while (left < right){ //do until left >= right
            if (input.charAt(left) != input.charAt(right)) { //neu ki tu dau != ki tu cuoi > false luon
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input1 = "uwewrwwewuwueeuwuw";
        String input2 = "havanaavhnah";

        System.out.println(longestPalindrome(input1));
        System.out.println(longestPalindrome(input2));
    }
    }


