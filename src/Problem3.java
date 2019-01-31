//This problem was asked by Uber.
//
//        Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
// Find the minimum element in O(log N) time. You may assume the array does not contain duplicates.
//
//        For example, given [5, 7, 10, 3, 4], return 3.
public class Problem3 {
    public static void main(String [] args){
        int [] arr = new int[5];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 10;
        arr[3] = 3;
        arr[4] = 4;
        System.out.print(binarySearch(arr,0, 4));
    }
    private static int binarySearch(int [] arr, int l, int r){
        if (l == r){
            return arr[l];
        }
        int mid = (l + r) /2;
        if (arr[mid] < arr[r]){
            r = mid;
        }else {
            l = mid +1;
        }
        return binarySearch(arr,l,r);
    }
}
