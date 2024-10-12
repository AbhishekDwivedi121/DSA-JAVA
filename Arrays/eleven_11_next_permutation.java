// Problem Statement:-
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory

// Example:-

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]

// Example 2:
// Input: nums = [3,2,1]
// Output: [1,2,3]

// Example 3:
// Input: nums = [1,1,5]
// Output: [1,5,1]
public class eleven_11_next_permutation {
    static void swap(int arr[], int i, int j){
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
    static void approach_first(int arr[]){
        int index = -1;
        for(int i = arr.length - 2; i >= 0; i --){
            if(arr[i] < arr[i + 1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, arr.length - 1);
            return;
        }
        for(int i = arr.length - 1; i > index; i --){
            if(arr[i] > arr[index]){
                swap(arr, index, i);
                break;
            }

        }
        reverse(arr, index + 1, arr.length - 1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        approach_first(arr);
        for(int i : arr){
            System.out.print(i);
        }
        
    }
}
