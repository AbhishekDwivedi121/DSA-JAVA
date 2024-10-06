// Probelm Statement:-

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


// Examples:-

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]


public class sixth_6_sort_0_1_2 {
    static void first_approach(int arr[]){
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 0) zero ++;
            else if(arr[i] == 1) one ++;
            else two ++;
        }
        for(int i = 0; i < zero; i ++){
            arr[i] = 0;
        }
        for(int i = zero; i < one + zero; i ++){
            arr[i] = 1;
        }
        for(int i = one + zero; i < arr.length; i ++){
            arr[i] = two;
        }
    }


    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void approach_secound(int arr[]){

        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low ++;
                mid ++;
            }else if(arr[mid] == 1){
                mid ++;
            }else{
                swap(arr, mid, high);
                high --;
            }
                    
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        approach_secound(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
        
    }
}
