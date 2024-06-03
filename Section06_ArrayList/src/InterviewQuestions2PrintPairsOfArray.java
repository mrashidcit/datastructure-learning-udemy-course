import java.util.Arrays;

public class InterviewQuestions2PrintPairsOfArray {
    public static void main(String[] args) {
        int[] customArray = {1, 3, 4, 5};
//        printPairs(customArray);
//        printUnorderedPairs(customArray);
        reverse(customArray);
    }
    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + " , " + array[j] + " | ");
            }
            System.out.println();
        }
    }

    public static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print(array[i] + " , " + array[j] + " | ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] array) {
        for (int i =0; i < array.length/2; i++) {
            int other = array.length-i-1;
            int first = array[i];
            array[i] = array[other];
            array[other] = first;
        }
        System.out.println(Arrays.toString(array));
    }
}
