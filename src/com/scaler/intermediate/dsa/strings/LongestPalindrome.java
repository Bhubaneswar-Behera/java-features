package com.scaler.intermediate.dsa.strings;

/**
 * Given a String s, find the length of the longest palindromic substring of
 * s.
 * Input : S = "anamadam"
 * Output : 5
 * Explanation: "madam" is the longest palindromic substring as compare to
 *              "ana" and "ama"
 */
public class LongestPalindrome {

    public static int longestPalindromicSubstringBruteForce(String str){
        int n = str.length();
        int answer = 0;

        for(int i = 0 ; i < n ;i++){
            for(int j = i;j < n;j++){
                if(isPalindrome(str,i , j)){
                    answer = Math.max(answer, j -i + 1);
                }
            }
        }

        return answer;
    }



    public static int longestPalindromicSubstring(String str){
        int n = str.length();
        int answer = 0;
        //for odd length , 1 center
        for(int i = 0;i < n;i++){
            int left = i;
            int right = i;
            while(left >=0 && right < n){
                if(str.charAt(left) != str.charAt(right)){
                    break;
                }
                left--;
                right++;
            }
            answer = Math.max(answer , right - left -1);
        }
        //for even length, 2 center
        for (int i = 0;i < n -1; i++) {
            int left = i;
            int right = i + 1;
            while(left >= 0 && right < n){
               if(str.charAt(left) != str.charAt(right)){
                   break;
               }
               left--;
               right++;
            }
            answer = Math.max(answer,right-left-1);
        }
        return answer;
    }

    public static String getLongetsSubString(String A){
        String answer = "";
        int n = A.length();

        for(int i = 0 ;i < n ;i++){
            String oddPalindrome = oddEven(A,i,i);
            String evenPalindrome = oddEven(A,i,i+1);
            String max = oddPalindrome;
            if(max.length() < evenPalindrome.length()){
                max = evenPalindrome;
            }
            if(answer.length() < max.length()){
                answer = max;
            }
        }
        return answer;
    }

    public static String oddEven(String A, int start, int end){
        int n = A.length();
        int left = start;
        int right = end;

        while(left >= 0 && right < n){
            if(A.charAt(left) != A.charAt(right)){
                break;
            }
            left--;
            right++;
        }
        return A.substring(left + 1, right);
    }
    public static boolean isPalindrome(String str, int start, int end){
        int i = start;
        int j = end;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "anamadam";
        System.out.println(longestPalindromicSubstringBruteForce(str));
        System.out.println(longestPalindromicSubstring(str));
        System.out.println(getLongetsSubString(str));
    }
}
