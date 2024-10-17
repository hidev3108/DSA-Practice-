package Arrays;

public class MissingNumber {
    public static int missingNo(int arr[], int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
