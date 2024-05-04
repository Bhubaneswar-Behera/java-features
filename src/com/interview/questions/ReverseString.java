package com.interview.questions;

/**
 * SAL LABS - 30-April-2024
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "sa;&tt";
        reverseString(str);
    }
    public static void reverseString(String str){
        int n = str.length();
        char[] tempArray = str.toCharArray();
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if(!Character.isAlphabetic(tempArray[i])){
                i++;
            } else if(!Character.isAlphabetic(tempArray[j])){
                j--;
            }

            else  {
                char temp = tempArray[i];
                tempArray[i] = tempArray[j];
                tempArray[j] = temp;
                i++;
                j--;
            }
        }

        for (char ch: tempArray) {
            System.out.print(ch);
        }
    }
}
