package com.scaler.advanced.dsa.module4.bit.maniplutaion.two;

import java.util.ArrayList;

/**
 * Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
 * Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
 *
 * Input : A = [3, 2, 4] Output : [1, 5]
 *Explanation : The missing numbers are 1 and 5.
 *
 * Input : A = [5, 1, 3, 6] Output : [2, 4]
 * Explanation: The missing numbers are 2 and 4.
 */
public class FindTwoMissingNumbers {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xorForAll = 0;
        for(int i=0; i<A.size(); i++){   // First XOR loop of all array elements
            xorForAll = xorForAll ^ A.get(i);
        }

        for(int i=1; i<=A.size()+2; i++){ // Second loop to XOR from 1 to N+2
            xorForAll = xorForAll ^ i;
        }

        int pos = 0;
        for(int i=0; i<32; i++){          // To find the recent set bit position
            if((xorForAll & (1<<i)) != 0){
                pos = i;
                break;
            }
        }

        int oneGroup = 0;
        int zeroGroup = 0;

        for(int i : A){
            if((i & (1<<pos)) != 0){         // Performing XOR on set bit position for all array elements
                oneGroup = oneGroup ^ i;
            }
            else{
                zeroGroup = zeroGroup ^ i;
            }
        }

        for(int i = 1; i<=A.size()+2; i++ ){
            if((i & (1<<pos)) != 0){       // Performing XOR on set bit position from 1 to N+2
                oneGroup = oneGroup ^ i;
            }
            else{
                zeroGroup = zeroGroup ^ i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(oneGroup < zeroGroup){
            ans.add(oneGroup);
            ans.add(zeroGroup);
        }
        else{
            ans.add(zeroGroup);
            ans.add(oneGroup);
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        System.out.println(solve(arrayList));
    }


}
