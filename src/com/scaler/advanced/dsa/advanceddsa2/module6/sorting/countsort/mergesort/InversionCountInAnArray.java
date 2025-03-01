package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

/**
 * Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j)
 * is called an inversion of A.
 * Find the total number of inversions of A modulo (109 + 7).
 *
 * Input : A = [1, 3, 2]     Output : 1
 * Explanation : The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 *
 * Input : A = [3, 4, 1, 2]  Output : 4
 * Explanation :
 * The pair (0, 2) is an inversion as 0 < 2 and A[0] > A[2]
 * The pair (0, 3) is an inversion as 0 < 3 and A[0] > A[3]
 * The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 * The pair (1, 3) is an inversion as 1 < 3 and A[1] > A[3]
 *
 */
public class InversionCountInAnArray {
    int inversionCount = 0;
    void merge(int[] A,int L,int mid,int R)
    {
        int n1 = mid - L + 1;
        int n2 = R - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        int index = 0;
        for (int i = L; i <= mid; i++) {
            leftArray[index] = A[i];
            index++;
        }

        index = 0;
        for (int i = mid + 1; i <= R; i++) {
            rightArray[index] = A[i];
            index++;
        }

        index = L;

        int left = 0;
        int right = 0;
        while(left < n1 && right < n2)
        {
            if(leftArray[left] <= rightArray[right])
            {
                A[index] = leftArray[left];
                left++;
            }
            else
            {//that means A[i] > A[j]
                A[index] = rightArray[right];
                right++;
                inversionCount = inversionCount + (n1-left);
                inversionCount %= 1000000007;
            }
            index++;
        }
        while(left < leftArray.length)
        {
            A[index] = leftArray[left];
            left++;
            index++;
        }
        while(right < rightArray.length)
        {
            A[index] = rightArray[right];
            right++;
            index++;
        }

    }
    void mergesort(int[] A,int L,int R)
    {
        if(L==R)
        {
            return ;
        }
        int mid = (L+R)/2;
        mergesort(A,L,mid);
        mergesort(A,mid+1,R);
        merge(A,L,mid,R);
    }
    public int solve(int[] A) {
        mergesort(A,0,A.length-1);
        return inversionCount;
    }


    public static void main(String[] args) {
        int[] A = {3, 4, 1, 2};
        InversionCountInAnArray obj = new InversionCountInAnArray();
        System.out.println(obj.solve(A));
    }
}
