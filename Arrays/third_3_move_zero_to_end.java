// Problem Statement :-
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Examples:-

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


// Example 2:
// Input: nums = [0]
// Output: [0]+


import java.util.ArrayList;
public class third_3_move_zero_to_end {
    static void approach_first(int  arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i ++){
            if(i < list.size()){
                arr[i] = list.get(i);
            }else{
                arr[i] = 0;
            }
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void approach_secound(int arr[]){
        int i = 0, j = 1;
        while (j < arr.length) {
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr, i, j);
                i ++;
            }
            if(arr[i] != 0){
                i ++;
            }
            j ++;   
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
    }
    
}
