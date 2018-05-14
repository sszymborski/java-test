package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class MyCurrencyConverter implements CurrencyConverter {

    @Override
    public Amount convertToPln(Amount euroAmount) {
        if (euroAmount.getValue() > 0)
            return new Amount((long) (euroAmount.getValue() * EURO_TO_PLN_RATIO), Currency.PLN);
        return new Amount(0, Currency.PLN);
    }

    @Override
    public Amount convertToEur(Amount plnAmount) {
        if (plnAmount.getValue() > 0)
            return new Amount((long) (plnAmount.getValue() / EURO_TO_PLN_RATIO), Currency.EUR);
        return new Amount(0, Currency.EUR);
    }
}
