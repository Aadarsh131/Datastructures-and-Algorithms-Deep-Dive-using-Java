public class QuickSort {
    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public void qs(int low, int high) {
        if (low < high) {
            int partitionIdx = partition(low, high);
            qs(low, partitionIdx - 1);
            qs(partitionIdx + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= arr[pivot] && i < high) {
                i++;
            }
            while (arr[j] > arr[pivot] && j > low) {
                j--;
            }

            if (i < j) {
                swap(i, j);
            } else {
                if (j != pivot) { //to prevent swapping of already sorted array
                    swap(j, pivot);
                }
            }
        }
        return j;
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
