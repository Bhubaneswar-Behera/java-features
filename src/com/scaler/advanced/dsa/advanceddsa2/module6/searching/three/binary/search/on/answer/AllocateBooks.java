package com.scaler.advanced.dsa.advanceddsa2.module6.searching.three.binary.search.on.answer;

import java.util.Arrays;

/**
 * Given an array of integers A of size N and an integer B.
 *
 * The College library has N books. The ith book has A[i] number of pages.
 *
 * You have to allocate books to B number of students so that the maximum number of pages allocated to a student is minimum.
 *
 * A book will be allocated to exactly one student.
 * Each student has to be allocated at least one book.
 * Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
 * Calculate and return that minimum possible number.
 *
 * NOTE: Return -1 if a valid assignment is not possible.
 *
 * Input : A = [12, 34, 67, 90]  B = 2   Output :113
 * Explanation :
 *  There are two students. Books can be distributed in following fashion :
 * 1)  [12] and [34, 67, 90]
 *     Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
 * 2)  [12, 34] and [67, 90]
 *     Max number of pages is allocated to student 2 with 67 + 90 = 157 pages
 * 3)  [12, 34, 67] and [90]
 *     Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
 *     Of the 3 cases, Option 3 has the minimum pages = 113.
 *
 * Input : A = [12, 15, 78]      B = 4   Output : -1
 * Explanation 2:
 *  Each student has to be allocated at least one book.
 *  But the Total number of books is less than the number of students.
 *  Thus each student cannot be allocated to atleast one book.
 *  Therefore, the result is -1.
 */
public class AllocateBooks {
    public static int books(int[] A, int B) {
        int n = A.length;
        if(n < B){//edge case
            return -1;
        }

        int max = getMax(A);
        int sum = Arrays.stream(A).sum();

        int low = max;
        int high = sum;
        int answer = 0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(A,B,mid)){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }

    public static boolean isValid(int[] A,int stds,int pages){
        int n = A.length;
        int num = 1;
        int sum=0;

        for(int i=0;i<n;i++){
            if(sum + A[i] <= pages){
                sum= sum + A[i];
            }
            else{
                num++;
                sum=A[i];
            }
        }
        return (num <= stds);
    }

    public static int getMax(int[] A){
        int max = Integer.MIN_VALUE;
        for (int i: A) {
            max = Math.max(max,i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        int B = 2;
        System.out.println(books(A,B));
    }
}
