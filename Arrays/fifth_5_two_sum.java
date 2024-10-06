// Probelm Statement :-

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


// Examples:-

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]



import java.util.*;
public class fifth_5_two_sum {
    static int[] first_approach(int arr[], int target){
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j ++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    static int[] secound_approach(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i ++){
            if(map.containsKey(target - arr[i])){
                return new int[]{map.get(target - arr[i]), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};

    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(first_approach(arr, target)[0]);
        System.out.println(first_approach(arr, target)[1]);
        System.out.println(secound_approach(arr, target)[0]);
        System.out.println(secound_approach(arr, target)[1]);
        
    }
}
