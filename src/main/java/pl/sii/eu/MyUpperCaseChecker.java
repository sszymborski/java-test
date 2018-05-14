package pl.sii.eu;

public class MyUpperCaseChecker implements UpperCaseChecker {

    @Override
    public boolean hasUpperCaseLetters(String input) {
        char[] inputArray;
        inputArray = input.toCharArray();
        for (char c : inputArray)
            if (Character.isUpperCase(c))
                return true;
        return false;
    }
}
