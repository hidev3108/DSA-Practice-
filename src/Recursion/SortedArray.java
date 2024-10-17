package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int arry1[] = {2, 4, 6, 8, 3};
        System.out.println(sortedArray(array, 0));
        System.out.println(sortedArray(arry1, 0));
    }

    public static boolean sortedArray(int array[], int index) {
        if (index == array.length - 1) return true;
        if (array[index] > array[index + 1]) return false;
        return sortedArray(array, index + 1);
    }
}
