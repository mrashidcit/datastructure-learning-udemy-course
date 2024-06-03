package gcd;

import java.util.Arrays;

public class GCDOfArrayUtil {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3};
        int[] arr = {2, 4, 6, 8};
//        int[] arr = {4, 8, 12};
//        int[] arr = {4, 8, 9};
        System.out.println("input : " + Arrays.toString(arr));
        System.out.println(GcdOfArray(arr, 0));

    }

    static int GcdOfArray(int[] arr, int index) {
        System.out.println("GcdOfArray : ");
        if (index == arr.length - 1) return arr[index];
        int a = arr[index];
        int b = GcdOfArray(arr, index + 1);
        System.out.println("GcdOfArray : a = " + a + " ... b = " + b);
        return gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return gcd(b, a%b);
    }

}
