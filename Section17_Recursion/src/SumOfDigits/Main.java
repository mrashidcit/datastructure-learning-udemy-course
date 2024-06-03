package SumOfDigits;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(112));
    }

//    public static int sumOfDigits(int n, int result) {
//        if (n%10 == 0) return n;
//        result += sumOfDigits(n/10, result);
//        return result;
//    }

    public static int sumOfDigits(int n) {
        if (n== 0 || n < 0) return 0;
        return n%10 + sumOfDigits(n/10);
    }




}
