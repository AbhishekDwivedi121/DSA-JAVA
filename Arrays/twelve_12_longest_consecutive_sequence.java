// Problem Statement:-
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// Examples:-
// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
import java.util.*;
public class twelve_12_longest_consecutive_sequence {
    static boolean linear_search(int arr[], int element){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }

    static int approach_first(int arr[]){
        int max = 0;
        for(int i = 0; i < arr.length; i ++){
            int element = arr[i];
            int counter = 0;
            while (linear_search(arr, element) == true) {
                element ++;
                counter ++;  
            }
            max = Math.max(max, counter);
        }
        return max;
    }

    static int approach_secound(int arr[]){
        Arrays.sort(arr);
        int last_element = Integer.MIN_VALUE;
        int counter = 0, max = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] - 1 == last_element){
                counter ++;
                last_element = arr[i];
            }else if(arr[i] != last_element){
                counter = 1;
                last_element = arr[i];
            }
            max = Math.max(max, counter);
        }
        return max;
    }

    static int approach_third(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i < arr.length; i ++){
            set.add(arr[i]);
        }
        for(int i : set){
            if(!set.contains(i - 1)){
                int x = i;
                int counter = 1;
                while (set.contains(x + 1)) {
                    x ++;
                    counter ++;  
                }
                max = Math.max(max, counter);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(approach_third(arr));
        
    }

    
}