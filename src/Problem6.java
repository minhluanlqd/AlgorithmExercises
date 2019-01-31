/*This problem was asked by Etsy. #243

Given an array of numbers N and an integer k, your task is to split N into k partitions such that the maximum sum of
any partition is minimized. Return this sum.

For example, given N = [5, 1, 2, 7, 3, 4] and k = 3, you should return 8, since the optimal partition is
[5, 1, 2], [7], [3, 4].*/

public class Problem6 {

    //Binary Search
    public static int max_partition_sum(int[] arr, int k){
        int left = arr[0]; //left = max of the array
        for (int i = 1; i<arr.length; i++){
            if (left < arr[i]){
                left = arr[i];
            }
        }
        int right = 0; // right = sum of the array
        for (int i = 0; i<arr.length; i++){
            right += arr[i];
        }
        while (left < right){
            int mid = (left + right)/2;
            if (can_partition(arr, mid, k)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean can_partition(int[] arr, int limit, int k) {
        int total = 0;
        int partitions = 1;

        for (int num:arr) {
            if (total + num > limit){
                total = num;
                partitions += 1;
                if (partitions > k){
                    return false;
                }
            }else {
                total += num;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int [] arr = {5, 1, 2, 7, 3, 4};
        System.out.print(max_partition_sum(arr,3));
    }
}
