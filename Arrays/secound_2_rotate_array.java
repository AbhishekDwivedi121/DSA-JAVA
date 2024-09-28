// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Examples :-

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]


// Example 2:
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
public class secound_2_rotate_array {
    static void approach_first(int arr[], int k){
        k = k % arr.length;
        int size = arr.length - k;
        int temp[] = new int[size];
        for(int i = 0; i < size; i ++){
            temp[i] = arr[i];
        }
        int d = 0;
        for(int i = size; i < arr.length; i ++){
            arr[d ++] = arr[i];
        }
        for(int i = 0; i < temp.length; i ++){
            arr[ d++] = temp[i];
        }
    }
    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int i, int j){
        while (i <= j) {
            swap(arr, i, j);
            i ++;
            j --;   
        }
    }
    static void secound_approach(int arr[], int k){
        System.out.println(k);

        k = k % arr.length;
        int size = arr.length - k;
        reverse(arr, 0, size - 1);
        reverse(arr, size, arr.length - 1);
        reverse(arr, 0, arr.length - 1);


    }

    public static void main(String[] args) {
        int arr[] = {-1,-100,3,99};
        int k = 2;
        secound_approach(arr, k);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
        }
        
        
        
        
    }
}
