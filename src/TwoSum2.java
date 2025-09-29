public class TwoSum2 {
    public static void twoSum(int[] numbers, int target) {
            int left = 0;                  // tao con tro ben trai
            int right = numbers.length - 1; // tao con tro ben phai

            while (left < right) {
                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    // Tra ve 2 so tuong ung
                    System.out.println(" Hai so do la: " + numbers[left] + " va " + numbers[right]);
                    System.out.println(" Target: " + target);
                    return;
                } else if (sum < target) {
                    left++; // tang con tro trai de co tong lon hon
                } else {
                    right--; // giam con tro phai de tong giam di
                }
            }

            // Neu khong tim thay
        System.out.println(" Khong tim duoc cap so co tong bang target ");
        System.out.println(" Target " + target);
        }

        public static void main(String[] args) {

            int[] numbers = {1,2,3,5,8,13,21,34,56,90};
            int target = 111;

           twoSum(numbers, target);
        }
    }


