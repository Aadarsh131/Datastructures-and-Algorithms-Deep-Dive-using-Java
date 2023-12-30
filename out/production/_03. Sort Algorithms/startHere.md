# Sorting Algos
All the algos are implemented [here](Main.java)

[&check;] [1. Bubble Sort](#1-bubble-sort)  
[&check;] [2. Selection Sort](#2-selection-sort)  
[&check;] [3. Insertion Sort](#3-insertion-sort)  
[&check;] [4. Merge Sort](#4-merge-sort)  
[&check;] [5. Quick Sort](#5-quick-sort)  
[&cross;] [Shell Sort](#)  
[&cross;] [Counting Sort](#)  
[&cross;] [Radix Sort](#)  


### 1. Bubble Sort
- Its an in-place algorithm(doesn't need extra space), this algo degrades quickly as the size of array increase

- This is a [stable](../Importants/stableAndUnstableAlgo.md) sorting algo (as we are not swapping when elements values are same)
 > Time complexity - **O(n<sup>2</sup>)**
  ```java
    //bubble sort
    public void bubbleSort(){
        for(int unsortedArr=arr.length-1; unsortedArr >=1; unsortedArr--){
            for(int i=0; i<unsortedArr; i++){
                if(arr[i] > arr[i+1]) swap(arr,i,i+1);
            }
        }
    }
  ```

### 2. Selection Sort
- In place algo
- Is generally considered [Unstable](../Importants/stableAndUnstableAlgo.md) algo, but I made it [stable](../Importants/stableAndUnstableAlgo.md) with some little tweaks
> Time Complexity- **O(n<sup>2</sup>)**
 
### 3. Insertion Sort
- In place algo
- Stable algo
> Time Complexity- **O(n<sup>2</sup>)**

### 4. Merge Sort
> Time Complexity- **O(n log n)**
> 
> Space Complexity - **O(n)**
 
### 5. Quick Sort
- Inplace algo
> Time Complexity- **O(n log n)**
>
> Space Complexity - **O(1)**

