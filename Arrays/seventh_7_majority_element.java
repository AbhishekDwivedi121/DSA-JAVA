// Problem Statement :-

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Examples:-

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
import java.util.*;
public class seventh_7_majority_element {
    static int approach_first(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            int counter = 0;
            for(int j = i; j < arr.length; j ++){
                if(arr[i] == arr[j]){
                    counter ++;
                }
            }
            if(counter > (arr.length / 2)) return arr[i];
        }
        return -1;
    }

    static int approach_secound(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i ++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (arr.length / 2)){
                return it.getKey();
            }
        }
        return -1;
    }

    static int approach_third(int arr[]){
        int counter = 0;
        int element = 0;
        for(int i = 0; i < arr.length; i ++){
            if(counter == 0){
                counter = 0;
                element = arr[i];
            }else if (arr[i] != element){
                counter --;
            }else{
                counter ++;
            }
        }
        return element;
    }


public static void main(String[] args) {
    int arr[] = {2,2,1,1,1,2,2};
    System.out.println(approach_third(arr));
    
 }
}