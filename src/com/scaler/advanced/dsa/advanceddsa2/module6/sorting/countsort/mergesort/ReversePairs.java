package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.countsort.mergesort;

/**
 * Given an array of integers A, we call (i, j) an important reverse pair
 * if i < j and A[i] > 2*A[j].
 * Return the number of important reverse pairs in the given array A.
 *
 * Input : A = [1, 3, 2, 3, 1]    Output : 2
 * Explanation :
 * There are two pairs which are important reverse pair
 *  i.e  (1, 4) => A[1] > 2 * A[4] => 3 > 2 * 1 => 3 > 2 and
 *       (3, 4) => A[3] > 2 * A[4] => 3 > 2 * 1 => 3 > 2.
 *
 *
 * Input : A = [4, 1, 2]          Output : 1
 * Explanation :
 * There is only one pair
 * i.e (0, 1) => A[0] > 2 * A[1] => 4 > 2 * 1 => 4 > 1
 */
public class ReversePairs {
    int count = 0;
    public  int solve(int[] A) {
        mergesort(A,0,A.length-1);
        return count ;
    }
    public  void mergesort(int[] A,int L,int R)
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

    void merge(int[] A,int L,int mid,int R)
    {
        int n1 = mid-L+1;
        int n2 = R-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0;i<leftArray.length;i++)
        {
            leftArray[i] = A[L+i];
        }
        for(int i=0;i<rightArray.length;i++)
        {
            rightArray[i] = A[mid+1+i];
        }


        int p1 = 0;
        int p2 = 0;
        while(p1<leftArray.length && p2<rightArray.length)
        {
            if(leftArray[p1] > 2*(long)rightArray[p2])
            {
                count = count + leftArray.length - p1;
                p2++;
            }
            else
            {
                p1++;
            }
        }


        p1 = 0;
        p2 = 0;
        int index = L;
        while(p1<leftArray.length && p2<rightArray.length)
        {
            if(leftArray[p1]<=rightArray[p2])
            {
                A[index] = leftArray[p1];
                p1++;
            }
            else
            {
                A[index] = rightArray[p2];
                p2++;
            }
            index++;
        }
        while(p1<leftArray.length)
        {
            A[index] = leftArray[p1];
            p1++;
            index++;
        }
        while(p2<rightArray.length)
        {
            A[index] = rightArray[p2];
            p2++;
            index++;
        }

    }
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 3, 1};
        ReversePairs obj = new ReversePairs();
        System.out.println(obj.solve(A));
    }
}
