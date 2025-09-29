public class PrintFirstLetterOfWord {
    public static String logFirstLetters(String input) {
        String[] words = input.split(" ");
        String res = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                res += word.charAt(0) + " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(logFirstLetters("Java For Tester"));
        System.out.println(logFirstLetters("Hello World"));
    }

}
