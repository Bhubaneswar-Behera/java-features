package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int A[], int n ) {
        mergeSort(A,0,n-1);
    }

    public static void mergeSort(int A[], int l, int r) {
        if (l >= r) { // base case
            return;
        }

        int mid = (l + r) / 2;
        mergeSort(A, l, mid);
        mergeSort(A, mid + 1, r);
        merge(A, l, mid, r);
    }

    public static void merge(int[] A, int l, int mid, int r) {
        //Merge sorted halves A[l....mid] and A[mid+1....r]
        //and return A[l...r] in sorted array
        int N = A.length;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        int idx = 0;
        for (int i = l; i <= mid; i++) {
            leftArray[idx] = A[i];
            idx++;
        }

        idx = 0;
        for (int i = mid + 1; i <= r; i++) {
            rightArray[idx] = A[i];
            idx++;
        }

        idx = l;
        int left = 0; // moves over A
        int right = 0; // moves over B

        while (left < n1 && right < n2) {
            if (leftArray[left] <= rightArray[right]) {
                A[idx] = leftArray[left];
                idx++;
                left++;
            } else {
                A[idx] = rightArray[right];
                idx++;
                right++;
            }

        }

        while (left < n1) {
            A[idx] = leftArray[left];
            idx++;
            left++;
        }

        while (right < n2) {
            A[idx] = rightArray[right];
            idx++;
            right++;
        }
    }


    public static void main(String[] args) {
        int[] A = {3, 10, 6, 8, 15, 2, 12, 18, 17};
        int n = A.length;
        mergeSort(A,n);
        System.out.println(Arrays.toString(A));
    }
}
