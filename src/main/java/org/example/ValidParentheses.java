package org.example;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("([]{})"));
        System.out.println(isValidParentheses("([)]"));
        System.out.println(isValidParentheses("{[}"));
    }

    private static boolean isValidParentheses(String input) {
        Map<Character, Character> brackets = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        StringBuilder json = new StringBuilder();
        for (char key : input.toCharArray()) {
            if (brackets.containsKey(key)) {
                json.append(brackets.get(key));
            } else {
                if (json.isEmpty()) return false;
                if (key == json.charAt(json.length() -1)) {
                    json.deleteCharAt(json.length() - 1);
                }
            }
        }

        return json.isEmpty();
    }
}
