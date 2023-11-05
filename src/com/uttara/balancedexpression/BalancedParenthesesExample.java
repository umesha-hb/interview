package com.uttara.balancedexpression;

import java.util.Stack;

public class BalancedParenthesesExample {
	public
    static boolean balancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public
    static void main(String[] args) {
        String str = "[()]";
        if (balancedParenthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}