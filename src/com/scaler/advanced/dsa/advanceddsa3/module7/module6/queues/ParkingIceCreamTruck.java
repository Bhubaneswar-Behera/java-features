package com.scaler.advanced.dsa.advanceddsa2.module6.queues;

import java.util.*;

/**
 * Imagine you're an ice cream truck driver in a beachside town. The beach is divided into several sections, and each section has varying numbers of beachgoers wanting ice cream given by the array of integers A.
 *
 * For simplicity, let's say the beach is divided into 8 sections. One day, you note down the number of potential customers in each section: [5, 12, 3, 4, 8, 10, 2, 7]. This means there are 5 people in the first section, 12 in the second, and so on.
 *
 * You can only stop your truck in B consecutive sections at a time because of parking restrictions. To maximize sales, you want to park where the most customers are clustered together.
 *
 * For all B consecutive sections, identify the busiest stretch to park your ice cream truck and serve the most customers. Return an array C, where C[i] is the busiest section in each of the B consecutive sections. Refer to the given example for clarity.
 *
 * NOTE: If B > length of the array, return 1 element with the max of the array.
 *
 * Example :
 * Input : A = [1, 3, -1, -3, 5, 3, 6, 7]  B = 3 Output : [3, 3, 5, 5, 6, 7]
 * Explanation :
 *  Window position     | Max
 *  --------------------|-------
 *  [1 3 -1] -3 5 3 6 7 | 3
 *  1 [3 -1 -3] 5 3 6 7 | 3
 *  1 3 [-1 -3 5] 3 6 7 | 5
 *  1 3 -1 [-3 5 3] 6 7 | 5
 *  1 3 -1 -3 [5 3 6] 7 | 6
 *  1 3 -1 -3 5 [3 6 7] | 7
 *
 * Input : A = [1, 2, 3, 4, 2, 7, 1, 3, 6] B = 6 Output : [7, 7, 7, 7]
 * Explanation :
 * Window position     | Max
 * --------------------|-------
 * [1 2 3 4 2 7] 1 3 6 | 7
 *  1 [2 3 4 2 7 1] 3 6 | 7
 *  1 2 [3 4 2 7 1 3] 6 | 7
 *  1 2 3 [4 2 7 1 3 6] | 7
 *
 */
public class ParkingIceCreamTruck {
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int max=0;
        for(int i=0;i<A.size();i++){
            max=Math.max(max,A.get(i));
        }
        if(B>A.size()){
            return new ArrayList<>(max);
        }
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<B;i++){
            while(!deque.isEmpty() && A.get(i)>deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(A.get(i));
        }
        c.add(deque.peekFirst());

        int start=1;
        int end=B;
        while(end<A.size()){
            int inc=A.get(end);
            int out=A.get(start-1);
            if(out==deque.peekFirst()){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && inc>deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(inc);
            c.add(deque.peekFirst());
            start++;
            end++;
        }
        return c;
    }
    public static void main(String[] args) {
        List<Integer> A = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        int B = 3;
        System.out.println(slidingMaximum(A,B));
    }
}
