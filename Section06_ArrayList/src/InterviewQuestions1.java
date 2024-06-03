public class InterviewQuestions1 {
    public static void main(String[] args) {

        int[] customArray = {1,3,4,5};

        spofArray(customArray);
    }

    public static void spofArray(int[] array) {
        int sum = 0; int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
}
