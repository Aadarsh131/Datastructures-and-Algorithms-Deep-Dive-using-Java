import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        //Bubble Sort
        Sort a = new Sort(arr);
        a.bubbleSort();
        System.out.println(Arrays.toString(arr));

        //Selection Sort
        int[] arr1 = {20, 35, -15, 7, 55, 1, -22};
        Sort b = new Sort(arr1);
        b.selectionSort();
        System.out.println(Arrays.toString(arr1));

        //Insertion Sort
        int[] arr2 = {20, 35, -15, 7, 55, 1, -22};
        Sort c = new Sort(arr2);
        c.insertionSort();
        System.out.println(Arrays.toString(arr2));

        //Merge Sort
        int[] arr3 = {20, 35, -15, 7, 55, 1,40,2020,-35,43,2,0,1,5,2,222,-433,-22};
        Sort d = new Sort(arr3);
        d.mergeSort();
        //d.divide(0,arr3.length-1);
        System.out.println(Arrays.toString(arr3));

        //Quick Sort
        int[] arr4 = {20, 35, -15, 7, 55, 1,40,2020,-35,43,2,0,1,5,2,222,-433,-22};
        //int[] arr4 = {1,2,4,5,6,7}; //no swapping is done for sorted arrays/subarrays in our implementation
        QuickSort f = new QuickSort(arr4);
        f.qs(0,arr4.length-1);
        System.out.println(Arrays.toString(arr4));

        //Using JDK
        int[] arr5 = {20, 35, -15, 7, 55, 1,40,2020,-35,43,2,0,1,5,2,222,-433,-22};
//        Arrays.sort(arr5); //double-pivot sort, is generally faster
        Arrays.parallelSort(arr5); //uses the threads(good for larger datasets)
        System.out.println(Arrays.toString(arr5));

    }
}