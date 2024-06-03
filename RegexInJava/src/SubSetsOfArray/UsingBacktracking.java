package SubSetsOfArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsingBacktracking {

    public static void calcSubset(List<Integer> A,
                                  List<List<Integer>> res,
                                  List<Integer> subset,
                                  int index ) {
        // add current subset in the result list
        res.add(new ArrayList<>(subset));

        // Generate subsets by recursively including and
        // excluding elements
        for (int i = index; i < A.size(); i++) {
            // Include the current element in the subset
            subset.add(A.get(i));

            // Recursively generate subsets with the current
            // element included
            calcSubset(A, res, subset, i+1);

            // Exclude the current element from the subset
            // (backtracking)
            subset.remove(subset.size()-1);
        }
    }

    public static List<List<Integer>> subsets(List<Integer> A) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int index = 0;
        calcSubset(A, res, subset, index);

        return res;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        List<List<Integer>> res = subsets(array);

        for (List<Integer> subset: res){
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }


    }


    // ** My Initial Solution

//    public static void main(String[] args) {
//        int[] arr = new int[] {1,2,3};
//
//        printSubSetsOfArray(arr);
//    }

//    public static void printSubSetsOfArray(int[] arr) {
//        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                tempArrayList.add(arr[j]);
//                System.out.println(Arrays.toString(tempArrayList.toArray()));
//            }
//            tempArrayList.clear();
//        }
//    }
}
