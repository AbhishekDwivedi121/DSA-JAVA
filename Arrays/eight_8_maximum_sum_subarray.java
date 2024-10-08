// Problem Statement:-
// Given an integer array nums, find the 
// subarray with the largest sum, and return its sum.

// Examples:-

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class eight_8_maximum_sum_subarray {
    static int approach_first(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i ++){
            int sum = 0;
            for(int j = i; j < arr.length; j ++){
                sum += arr[j];
                max = Math.max(max, sum);

            }
        }
        return max;
    }
    static int approach_secound(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        
    }

    
}