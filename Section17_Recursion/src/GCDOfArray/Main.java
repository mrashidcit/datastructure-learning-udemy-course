package GCDOfArray;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

//        int[] values = new int[] {48, 18, 12};
        int[] values = new int[] {10, 30, 15};
        System.out.println(gcd(values));
    }

    public static int gcd(int[] arr) {
        Arrays.stream(arr).sorted();
        for (int item: arr) {
            if (item == 0)
                return Arrays.stream(arr).filter(value -> value != 0).min().getAsInt();
        }
        int minValue = Arrays.stream(arr).min().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (item !=  minValue) {
                item = item % minValue;
                arr[i] = item;
            }
        }
        return gcd(arr);
    }
}
