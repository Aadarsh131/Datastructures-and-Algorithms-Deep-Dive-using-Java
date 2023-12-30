import java.util.Arrays;

public class Sort {
    private int[] arr;
//    int[] merged = {0,0,0,0,0,0,0,0,0,0};

    public Sort(int[] arr) {
        this.arr = arr;
    }

    //bubble sort
    public void bubbleSort(){
        for(int unsortedArr=arr.length-1; unsortedArr >=1; unsortedArr--){
            for(int i=0; i<unsortedArr; i++){
                if(arr[i] > arr[i+1]) swap(arr,i,i+1);
            }
        }
    }

    //selection sort
    public void selectionSort(){
        for(int unsortedArr = arr.length-1; unsortedArr >=1; unsortedArr--){
            int largest = 0;
            for(int i = 1; i <= unsortedArr; i++){
                if (arr[i] > arr[largest]) largest = i;
            }
            //if largest is already at the last pos
            if (largest == arr.length-1) continue; //do nothing

            //do not swap if the element to be swapped is same (preventing the unstable sorting)
            if (arr[largest] == arr[arr.length-1]) continue; //do nothing

            //otherwise swap
            swap(arr, largest,unsortedArr);
        }
    }

    //insertion sort
    public void insertionSort(){
        int firstUnsortedIndex;
        for(int sortedArr=0; sortedArr < arr.length-1; sortedArr++){
            firstUnsortedIndex = sortedArr + 1;
            for(int i = sortedArr; i >=0 ; i--){
                if(arr[firstUnsortedIndex]  < arr[i]) {
                    swap(arr, firstUnsortedIndex, i);
                    firstUnsortedIndex = i;
                }
            }
        }
    }

//    merge sort
//    int[] tempArr = {0,0,0,0,0,0,0,0,0};
    public void mergeSort(){
//    15,5,24,8,1,3,16,10,20,-1
        int lb = 0;
        int ub = arr.length-1;
        divide(lb,ub);
//        System.out.println(Arrays.toString(merged));
    }
    public void divide(int lb, int ub){
        //base case
        if(lb >= ub){
            return; //or ub
        }

        int mid = lb + (ub-lb)/2;
            divide(lb,mid);
            divide(mid+1,ub);
            merge(lb,mid,ub);
    }
    public void merge(int lb, int mid, int ub){
        int[] merged = new int[ub-lb+1];
        int i = lb;
        int j = mid+1;
        int k = 0;

       while (i <= mid && j <= ub){
             if(arr[i] <= arr[j]){
                 merged[k++] = arr[i++];
             }
             else{
                 merged[k++] = arr[j++];
             }
       }
       //either of the two while loop would run
       while(j <= ub){
          merged[k++] = arr[j++];
       }
       while(i <= mid){
           merged[k++] = arr[i++];
       }
//       for(k=lb; k<=ub;k++){
//            arr[k] = merged[k];
//       }

        for(i = lb,j=0; i <= ub; i++,j++){
            arr[i] = merged[j];
        }
    }


    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
