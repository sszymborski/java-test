package pl.sii.eu;

import pl.sii.eu.model.Amount;

/**
 * Implement CurrencyConverter that will convert {@link Amount} instances between EUR & PLN {@link pl.sii.eu.model.Currency}.
 * Make sure that the result is always rounded to two fractional digits so that:
 * 10 EUR -> 42.52 PLN, but
 * 100 EUR -> 425.18 PLN
 */
interface CurrencyConverter {

    double EURO_TO_PLN_RATIO = 4.25181073;

    Amount convertToPln(Amount euroAmount);

    Amount convertToEur(Amount plnAmount);
}

