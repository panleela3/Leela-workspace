package com.java.lambda;

public class BinarySearchPgm {
    public static int binarySearchFirst(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                result = mid;     // Found k, but search to the left for the first occurrence
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;

        int index = binarySearchFirst(arr, k);

        if (index != -1) {
            System.out.println("The index of " + k + " is: " + index);
        } else {
            System.out.println(k + " is not present in the array.");
        }
    }
}
