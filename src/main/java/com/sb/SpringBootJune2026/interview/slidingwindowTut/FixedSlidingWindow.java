package com.sb.SpringBootJune2026.interview.slidingwindowTut;


/*

sliding window has 2 types
1) fixed sizw sw  -> first window then slide,single sliding window
2) variable size sw

 */

public class FixedSlidingWindow {

    public static void main(String[] args) {

        // Maximum Sum of Any Subarray of Size k
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        System.out.println(new FixedSlidingWindow().getMaxSumOfAnySubarraySizeKFirstWindowThenSlide(arr, k));
        System.out.println(new FixedSlidingWindow().getMaxSumOfAnySubarraySizeKSingleSlidingWindow(arr, k));

    }

    int getMaxSumOfAnySubarraySizeKFirstWindowThenSlide(int[] arr, int k) {
        // first window then slide
        int wSum = 0;
        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }

        int max = wSum;

        for (int i = k; i < arr.length; i++) {
            wSum = wSum + arr[i] - arr[i - k];
            max = Math.max(max, wSum);
        }
        return max;
    }

    int getMaxSumOfAnySubarraySizeKSingleSlidingWindow(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // Expand window
            sum += arr[right];

            // When window size becomes k
            if (right - left + 1 == k) {

                max = Math.max(max, sum);

                // Shrink window
                sum -= arr[left];
                left++;
            }
        }

        return max;
    }

    /*
    int left = 0;

for (int right = 0; right < n; right++) {

    // Add arr[right] to window

    if (right - left + 1 == k) {

        // Process current window

        // Remove arr[left] from window
        left++;
    }
}
     */

    /*
    These two templates cover most sliding-window interview problems:

Fixed window size (k) → use if (windowSize == k).
Variable window size → use while (condition violated) to shrink.
     */


}
