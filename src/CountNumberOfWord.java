public class CountNumberOfWord {
    public static void main(String[] args) {
        String str1 = "Java for tester";
        String str2 = "Hello World";

        // Tách chuỗi theo khoảng trắng " "
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");

        System.out.println("Output 1: " + arr1.length);
        System.out.println("Output 2: " + arr2.length);
    }
}
