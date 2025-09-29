public class SumEvenNumbers {
    public static int sumCount (int x) {

        int evenSumCount = 0 ;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0){
                evenSumCount += i ;
            }
        }
        return evenSumCount;
    }

    public static void main(String[] args) {
        int res1 = sumCount(20);
        System.out.println(res1);

        int res2 = sumCount(9);
        System.out.println(res2);


    }

}
