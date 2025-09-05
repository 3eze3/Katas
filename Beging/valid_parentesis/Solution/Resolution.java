package Beging.valid_parentesis.Solution;

import java.util.Map;
import java.util.Stack;

public class Resolution {
    public boolean validParentheses(String symbols) {
        Map<Character, Character> pairSymbols = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> arraysSymbols = new Stack<>();
        Character firsword = symbols.charAt(0);
        if (!pairSymbols.containsKey(firsword))
            return false;

        for (int i = 0; i < symbols.length(); i++) {
            Character current = symbols.charAt(i);
            if (pairSymbols.containsKey(current)) {
                arraysSymbols.push(current);
            } else {
                if (arraysSymbols.isEmpty())
                    return false;
                Character top = arraysSymbols.pop();
                if (pairSymbols.get(top) != current)
                    return false;

            }

        }

        return arraysSymbols.isEmpty();
    }
}
