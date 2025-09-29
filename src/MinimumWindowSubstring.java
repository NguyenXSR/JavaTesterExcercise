import java.util.HashMap;

public class MinimumWindowSubstring {

    public static String minWindow(String main, String sub) {
        if (main.length() < sub.length()) return "";

        // B1: Tạo bảng đếm ký tự của t
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : sub.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // B2: Dùng sliding window
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0; // đếm số ký tự đã đủ
        int start = 0, minLen = Integer.MAX_VALUE;

        while (right < main.length()) {
            // Lấy ký tự bên phải thêm vào cửa sổ
            char c = main.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue()) {
                    valid++;
                }
            }

            // Khi đủ hết ký tự trong t
            while (valid == need.size()) {
                // Cập nhật kết quả nếu ngắn hơn
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }

                // Thu hẹp cửa sổ từ bên trái
                char d = main.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : main.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "COCOICHIBANYA";
        String t = "HBA";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
}

