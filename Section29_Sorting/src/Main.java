import heapSort.HeapSort;

public class Main {
    public static void main(String[] args) {

        // *** Bubble Sort
//        BubbleSort bs = new BubbleSort();
//        int arr[] = {10, 5, 30, 15, 6};
//        bs.bubbleSort(arr);
//        bs.printArray(arr);

        // *** Selection Sort
//        int array[] = {10, 3, 2, 5, 8, 4, 1, 9};
//        SelectionSort.selectionSort(array);
//        SelectionSort.printArray(array);

        // *** Insertion Sort
//        int arr[] = {10, 3, 2, 5, 8, 4, 1, 9};
//        InsertionSort.insertionSort(arr);
//        InsertionSort.printArray(arr);

        // *** Bucket Sort
//        int arr[] = {9,7,5,4,2,1,3,6,8};
//        BucketSort bs = new BucketSort(arr);
//        bs.printArray();
//        bs.bucketSort();
//        System.out.println();
//        bs.printArray();

        // *** Bubble Sort
//        int array[] = {10,3,2,5,8,4,3,1,2,9,7,8};
//        MergeSort.mergeSort(array, 0, array.length-1);
//        MergeSort.printArray(array);

        // *** Quick Sort
//        int array[] = {10,3,2,5,8,4,3,1,2,9,7,8};
//        QuickSort.quickSort(array, 0, array.length-1);
//        QuickSort.printArray(array);

        // *** Heap Sort
        int arr[] = {10,3,2,5,8,4,3,1,2,9,7,8};
        HeapSort hs = new HeapSort(arr);
        hs.sort();
        hs.printArray();


    }
}


















