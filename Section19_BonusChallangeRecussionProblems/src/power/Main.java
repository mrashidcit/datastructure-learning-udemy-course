package power;

public class Main {
    public static void main(String[] args) {
//        System.out.println(power(2, 0));
        System.out.println(power(2, 4));
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent-1);
    }
}
