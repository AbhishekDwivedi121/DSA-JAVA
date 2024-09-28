// Problem Statement :-

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

// Examples: -

// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).


// Example 2:

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.*;

public class first_1_remove_duplicate_from_sorted_array {

    static int first_approach(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i ++){
            set.add(arr[i]);
        }
        int temp[] = new int[set.size()];
        int index = 0;
        for(int i : set){
            temp[index ++] = i;
        }
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++){
            arr[i] = temp[i];

        }
        return set.size();
    }


    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int approach_secound(int arr[]){
        int i = 0, j = 1;
        while(j < arr.length){
            if(arr[i] != arr[j]){
                swap(arr, i + 1, j);
                i ++;
            }
            j ++;
        }
        return i + 1;

    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(approach_secound(nums));
        System.out.println(first_approach(nums));
        
   
    }

    
}