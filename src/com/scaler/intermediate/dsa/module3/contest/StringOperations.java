package com.scaler.intermediate.dsa.module3.contest;

/**
 * Steps :
 * Concatentaion String with itself
 * Delete all upper case letters
 * Replace each vowels with #
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {
    public static String solve(String A) {

        A = A + A;
        String deletedString = removingUpperCaseCharacters(A);
        String result  = deletedString.replaceAll( "[aeiou]", "#" );
        return result;
    }

   public static String removingUpperCaseCharacters(String str)
    {
        String regex = "[A-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
    public static void main(String[] args) {
        String s = "aeiOUz";
        System.out.println(solve(s));
    }
}
