package gcd;

public class GCDOf2Numbers {
    public static void main(String[] args) {
        int result = gcd(8, 4);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
