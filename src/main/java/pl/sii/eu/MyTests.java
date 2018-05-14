package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class MyTests {

    public static void main(String[] args) {

        String[] testStrings = new String[4];
        testStrings[0] = "12345678asdfghjkqwertyuiozxcvbnmhgfd       a     lmcdkasmcsdk \t ";
        testStrings[1] = "12345678asdfghjkqwertyuiozxcvbnmhgfd    T   a     lmcdkasmcsdk \t ";
        testStrings[2] = "1234567890qwertyuiopasdfghj)(klzxcvbnm,./ ĄĆŚÓŁĘ Ł  \t ZXCVBNMASDFGHJKL;'QWERTYUIOP";
        testStrings[3] = "1234567890qwertyuiopasdfghjklzxcvbnm,./ ĄĆŚÓŁĘ   \t ZXCVBNMASDFGHJKL;'QWERTYUIOP";
        Boolean[][] testResults = new Boolean[2][4];

        MyUpperCaseChecker myUpperCaseChecker = new MyUpperCaseChecker();
        for (int i = 0; i < 4; ++i)
            testResults[0][i] = myUpperCaseChecker.hasUpperCaseLetters(testStrings[i]);

        MyDuplicateChecker myDuplicateChecker = new MyDuplicateChecker();
        for (int i = 0; i < 4; ++i)
            testResults[1][i] = myDuplicateChecker.hasDuplicateCharacters(testStrings[i]);

        for (int i = 0; i < 2; ++i) {
            System.out.println((i == 0) ? "UpperCaseChecker test:" : "DuplicateChecker test:");
            for (int j = 0; j < 4; ++j)
                System.out.println(testResults[i][j] + " \t InputString: " + testStrings[j]);
            System.out.println();
        }

        System.out.println("MyCurrencyConverter test:");
        Amount[] testAmount = new Amount[16];
        for (int i = 0; i < 16; ++i)
            testAmount[i] = new Amount(10000 * (i % 8) - 10000, (i < 8 ? Currency.PLN : Currency.EUR));
        MyCurrencyConverter myCurrencyConverter = new MyCurrencyConverter();
        for (int i = 0; i < 16; ++i)
            if (i < 8)
                System.out.println(testAmount[i].getValue() / Math.pow(10, Amount.PRECISION) + "PLN" + " = " +
                        myCurrencyConverter.convertToEur(testAmount[i]).getValue() / Math.pow(10, Amount.PRECISION) + "EUR");
            else
                System.out.println(testAmount[i].getValue() / Math.pow(10, Amount.PRECISION) + "EUR" + " = " +
                        myCurrencyConverter.convertToPln(testAmount[i]).getValue() / Math.pow(10, Amount.PRECISION) + "PLN");
    }
}
