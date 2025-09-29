import java.util.Scanner;

public class CaculatorIncomeTax {
    public static void calculateTax(double income) {
        if (income <= 0) {
            System.out.println("Khong phai nop thue");
            return;
        }

        // Moc thu nhap (trieu dong)
        double[] levels = {5, 10, 18, 32, 52, 80};
        // Ti le thue tuong ung tung moc
        double[] rates  = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};

        double tax = 0;
        double preLevel = 0;

        for (int i = 0; i < levels.length; i++) {
            if (income > levels[i]) {
                // Neu income lon hơn moc hien tai
                double taxable = levels[i] - preLevel;   // phan thue phai chiu
                double money = taxable * rates[i];       // so tien thue ơ bac tuong ung
                tax += money;

                System.out.println("Bậc " + (i+1) + " (" + preLevel + "-" + levels[i] + "): "
                        + money + " triệu");

                preLevel = levels[i];
            } else {
                // neu income nam trong bac hien tai
                double taxable = income - preLevel;
                double money = taxable * rates[i];
                tax += money;

                System.out.println("Bậc " + (i+1) + " (" + preLevel + "-" + income + "): "
                        + money + " triệu");

                System.out.println("Tổng thuế phải trả: " + tax + " triệu đồng");
                return;
            }
        }

        // thu nhap tren 80 trieu
        double taxable = income - preLevel;
        double money = taxable * rates[rates.length - 1];
        tax += money;

        System.out.println("Bậc 7 (" + preLevel + "+): " + money + " triệu");
        System.out.println("Tổng thuế phải trả: " + tax + " triệu đồng");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double income = sc.nextDouble();

        calculateTax(income);

        sc.close();
    }
}
