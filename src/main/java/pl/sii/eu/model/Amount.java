package pl.sii.eu.model;

public class Amount {
    public static final int PRECISION = 2;

    private final long value;
    private final Currency currency;

    public Amount(long value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        return value == amount.value && currency == amount.currency;
    }

    @Override
    public int hashCode() {
        int result = (int) (value ^ (value >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}

