public class Find2ndLargestValueInAnArray {

    public static int secondLargestNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        for (int number : arr) {
            if (number > max) {
                secondMax = max;  // đẩy max cũ xuống secondMax
                max = number;     // cập nhật max mới
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        return secondMax;
    }


    public static void main(String[] args) {
            int[] arr1 = {1, 3, 4, 5, 0, 2};
            int[] arr2 = {10, 5, 10};
            int[] arr3 = {3};

            System.out.println(secondLargestNum(arr1));
            System.out.println(secondLargestNum(arr2));
            System.out.println(secondLargestNum(arr3));
        }

    }


