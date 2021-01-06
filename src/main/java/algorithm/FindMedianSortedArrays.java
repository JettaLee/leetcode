package algorithm;

import java.util.HashMap;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] newArray = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < size) {
            if (j < nums1.length && k < nums2.length) {
                newArray[i] = nums1[j] < nums2[k] ? nums1[j++] : nums2[k++];
            } else if (j < nums1.length) {
                newArray[i] = nums1[j++];
            } else {
                newArray[i] = nums2[k++];
            }
            i++;
        }
        return (size & 1) == 0 ? (newArray[size / 2] + newArray[size / 2 - 1]) / 2.0 : newArray[size / 2];
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int des = size / 2;
        int i = 0, j = 0, k = 0;
        int mid1 = 0, mid2 = 0;
        int a1, a2;
        while (i++ <= des) {
            mid1 = mid2;
            if (j < nums1.length && (k >= nums2.length || nums1[j] < nums2[k])) {
                mid2 = nums1[j++];
            } else {
                mid2 = nums2[k++];
            }
        }
        return (size & 1) == 0 ? (mid1 + mid2) / 2.0 : mid2;
    }

    public static void main(String[] args) {
        double medianSortedArrays = findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
}
