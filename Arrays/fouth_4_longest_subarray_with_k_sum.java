// Problem Statement:-
// Given an array of integers nums and an integer k, return Longest Subarray whose sum is equal to k

// Example:
// Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]

// Output: 4

// There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.




public class fouth_4_longest_subarray_with_k_sum {
    static int approach_first(int arr[], int k){
        int max = 0;
        for(int i = 0; i < arr.length; i ++){
            int sum = 0;
            for(int j = i; j < arr.length; j ++){
                sum += arr[j];
                if(sum == k){
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 0, 1 };
        int k = 5;
        System.out.println(approach_first(arr, k));
    }
    
}
