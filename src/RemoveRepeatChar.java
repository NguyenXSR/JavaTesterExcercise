public class RemoveRepeatChar {

    public static String removeDuplicates(String input) {
        // Chuỗi kết quả (ban đầu rỗng)
        String result = "";

        // Duyệt từng ký tự trong chuỗi đầu vào
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Nếu ký tự này chưa có trong result thì mới thêm vào
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "gvnwrnvoanvnvkns";
        String newStr = removeDuplicates(str);

        System.out.println("Chuỗi gốc: " + str);
        System.out.println("Chuỗi sau khi xóa ký tự lặp: " + newStr);
    }
}

