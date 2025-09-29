import java.util.Scanner;

public class CaculatorIncomeTax {
    public static double calculateTax(double income) {
        if (income <= 0) {
            return 0;
        }

        // Các mốc thu nhập (triệu đồng)
        double[] levels = {5, 10, 18, 32, 52, 80};
        // Thuế suất tương ứng
        double[] rates  = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};

        double tax = 0;
        double preLevel = 0;

        for (int i = 0; i < levels.length; i++) {
            if (income > levels[i]) {
                tax += (levels[i] - preLevel) * rates[i];
                preLevel = levels[i];
            } else {
                tax += (income - preLevel) * rates[i];
                return tax;
            }
        }

        // Nếu thu nhập > 80 triệu (bậc 7)
        tax += (income - preLevel) * rates[rates.length - 1];

        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Thu nhập hàng năm (triệu đồng): ");
        double income = sc.nextDouble(); //sc.nextDouble() dung de nhap so thuc va luu vao bien income

        double tax = calculateTax(income);

        System.out.println("Số thuế phải trả: " + tax + " triệu đồng");

        sc.close();
    }

}
