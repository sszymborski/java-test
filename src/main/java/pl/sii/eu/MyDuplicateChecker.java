package pl.sii.eu;

import java.util.Vector;

public class MyDuplicateChecker implements DuplicateChecker {

    @Override
    public boolean hasDuplicateCharacters(String input) {
        char[] inputArray;
        inputArray = input.toCharArray();
        Vector<Character> letters = new Vector<>();
        for (char c : inputArray)
            if (Character.isLetter(c))
                if (letters.contains(c))
                    return true;
                else
                    letters.add(c);
        return false;
    }
}