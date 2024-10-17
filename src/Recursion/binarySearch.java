package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        System.out.println(BinarySearch(arr,3));
    }

    public static int BinarySearch(int arr[], int search) {
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        // int mid = (low+high)/2 - Integer.MAX_VALUES ;
        if (arr[mid] == search) return mid;
        if(arr[mid] < search) {
            low = mid +1 ;
            return low ;
        }
        if(arr[mid] > search) {
            high = mid -1 ;
            return high ;
        }
        return -1 ;
    }
}
