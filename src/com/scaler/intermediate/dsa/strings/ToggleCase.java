package com.scaler.intermediate.dsa.strings;

/**
 * Given a String consists of only letters.
 * Change all lower case letter to upper case and vice versa
 * and print the String.
 *
 * Input: HeLl0 Output: hElL0
 */
public class ToggleCase {
    public static String solution1(String A){
        StringBuilder sbr = new StringBuilder();
        int n = A.length();

        for (int i = 0;i < n;i++) {
            char ch = A.charAt(i);

            if(ch >= 65 && ch <= 90){
                char newChar = (char)(ch + 32);
                sbr.append(newChar);
            } else{
                char newChar = (char)(ch - 32);
                sbr.append(newChar);
            }
        }
        return sbr.toString();
    }
    public static String solution2(String A){
        StringBuilder sbr = new StringBuilder();
        int n = A.length();

        for (int i = 0;i < n;i++) {
            char ch = A.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char newChar = (char) (ch + ('a' - 'A'));
                sbr.append(newChar);
            } else{
                char newChar = (char) (ch - ('a' - 'A'));
                sbr.append(newChar);
            }
        }
        return sbr.toString();
    }
    public static String solution3(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        String output = "";

        for (int i = 0;i < n;i++) {
            char ch = (char)(chars[i] ^ 32);
            output = output + ch;
        }
        return output;
    }
    public static void main(String[] args) {
        String s = "tHiSiSaStRiNg";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
        System.out.println(solution3(s));
    }
}
