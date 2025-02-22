package com.scaler.advanced.dsa.advanceddsa3.module7.stacks1;

import java.util.Stack;

/**
 * Given string A denoting an infix expression. Convert the infix expression into a postfix expression.
 * String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets
 * where lowercase English alphabets are operands and ^, /, *, +, - are operators.
 *
 * Find and return the postfix expression of A.
 * NOTE:
 * ^ has the highest precedence.
 * / and * have equal precedence but greater than + and -.
 * + and - have equal precedence and lowest precedence among given operators.
 *
 * Example  :
 * Input : A = "a+b*(c^d-e)^(f+g*h)-i" Output : "abcd^e-fgh*+^*+i-"
 *
 */
public class InfixToPostfix {
    public static String solve(String A) {
        int n = A.length();
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            if(ch>='a' && ch<='z'){
                ans.append(ch);
            }
            else if(ch=='*' || ch=='/' || ch=='+' || ch=='-' || ch=='^'){
                if(st.isEmpty()==false) {
                    while(st.isEmpty()==false && precedence(st.peek())>=precedence(ch)){
                        ans.append(st.pop());
                    }
                }
                st.push(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(st.isEmpty()==false && st.peek()!='('){
                    ans.append(st.pop());
                }
                if(st.isEmpty()==false)
                    st.pop();
            }
        }
        while(st.isEmpty()==false){
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static int precedence(char ch) {
        if(ch=='^'){
            return 3;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        //Input : A = "x^y/(a*z)+b   Output : "xy^az*/b+"
        String A = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(solve(A));
    }

}




