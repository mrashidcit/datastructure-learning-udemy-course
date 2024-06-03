package gcd.practice;

import java.util.Arrays;

public class GCDOfArray {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3};
//        int[] arr = {2, 4, 8, 12};
//        int[] arr = {4, 8, 12};
        int[] arr = {12, 8, 2, 4};
        System.out.println("input : " + Arrays.toString(arr));
        System.out.println(gcdOfArray(arr, 0));

    }

    static int gcdOfArray(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        int a = arr[index];
        int b = gcdOfArray(arr, index + 1);
        return gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);

    }

}
