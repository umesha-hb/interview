package com.uttara.string.infixtopostifix;

import java.util.Stack;

public class StringInfixToPostFix {
	public static void main(String[] args) {
		StackImpl a = new StackImpl();


		String s4 = a.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
		System.out.println(s4);
	}
} 

class StackImpl {

	public String infixToPostfix(String s) 
	{
		Stack<Character> st = new Stack<Character>();
		String postfix = "";
		char ch[] = s.toCharArray();

		for (char c : ch) 
		{
			if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')')
			{
				postfix = postfix + c;
			}
			else if (c == '(')
			{
				st.push(c);
			} 
			else if (c == ')') 
			{
				while (!st.isEmpty()) 
				{
					char t = st.pop();
					if (t != '(')
					{
						postfix = postfix + t;
					} 
					else
					{
						break;
					}
				}
			} 
			else if (c == '+' || c == '-' || c == '*' || c == '/')
			{
				if (st.isEmpty())
				{
					st.push(c);
				} 
				else
				{
					while (!st.isEmpty()) 
					{
						char t = st.pop();
						if (t == '(')
						{
							st.push(t);
							break;
						}
						else if (t == '+' || t == '-' || t == '*' || t == '/') 
						{
							if (getPriority(t) < getPriority(c)) 
							{
								st.push(t);
								break;
							} 
							else 
							{
								postfix = postfix + t;
							}
						}
					}
					st.push(c);
				}
			}
		}
		while (!st.isEmpty())
		{
			postfix = postfix + st.pop();
		}
		return postfix;
	}

	public int getPriority(char c) 
	{
		if (c == '+' || c == '-')
		{
			return 1;
		} 
		else 
		{
			return 2;
		}
	}

}
