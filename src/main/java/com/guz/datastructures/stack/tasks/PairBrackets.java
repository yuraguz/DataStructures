package com.guz.datastructures.stack.tasks;

import static java.lang.String.format;

import com.guz.datastructures.stack.my.MyStack;
import com.guz.datastructures.stack.my.MyStackImpl;

/**
 * Check is there valid brackets pairs in input text.
 *
 * @author Iurii_Guz
 */
public class PairBrackets {

    public static void main(String[] args) {
        doCheck("([fda{dfa}fda]fda)");
        doCheck("({]})");
        doCheck("]})");
        doCheck("{}()[]");
        doCheck("fda");
    }

    private static void doCheck(String inputText) {
        System.out.println(format("%s : %s", inputText, checkForValidaBracketPairs(inputText)));
    }

    private static boolean checkForValidaBracketPairs(String text) {
        MyStack<Character> deque = new MyStackImpl<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch) {
                case '(':
                case '[':
                case '{':
                    deque.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (deque.isEmpty()) {
                        return false;
                    }

                    char previous = deque.pop();
                    if (!(('(' == previous && ')' == ch)
                        || ('[' == previous && ']' == ch)
                        || ('{' == previous && '}' == ch))) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return true;
    }
}
