package com.scaler.advanced.dsa.advanceddsa3.module7.backtracking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given a digit string A, return all possible letter combinations
 * that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons)
 * is given below.The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.
 *
 * NOTE: Make sure the returned strings are lexicographically sorted.
 *
 * Input : A = "23"
 * Output : ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
 * Explanation : There are 9 possible letter combinations.
 *
 * Input : A = "012"
 * Output 2: ["01a", "01b", "01c"]
 * Explanation : Only 3 possible letter combinations.
 *
 */
public class LetterPhone {


    public static void generateHelper(String A, int index, StringBuilder current, HashMap<Character, String> hashMap,
                                      ArrayList<String> result){
        if (index == A.length()) {
            result.add(current.toString());
            return;
        }
        char ch = A.charAt(index);
        String str = hashMap.get(ch);
        for (int i = 0; i < str.length(); i++) {
            current.append(str.charAt(i));
            generateHelper(A, index + 1, current, hashMap, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static ArrayList<String> letterCombinations(String A) {
        ArrayList<String> result = new ArrayList<>();
        if (A.length() == 0) {
            return new ArrayList<>();
        }

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('0', "0");
        hm.put('1', "1");
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        generateHelper(A, 0, new StringBuilder(), hm, result);
        return result;
    }
    public static void main(String[] args) {
        String A = "23";
        System.out.println(letterCombinations(A));
    }
}
