public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
            if (str == null) {
                return false; //neu chuoi rong tra ve false
            }

            int left = 0; //index = 0
            int right = str.length() - 1; //index = length - 1

            // So sánh ký tự từ 2 đầu
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }


        public static void main(String[] args) {
            System.out.println(isPalindrome("abba"));  // true
            System.out.println(isPalindrome("abc"));   // false
            System.out.println(isPalindrome("madam")); // true
        }
    }


