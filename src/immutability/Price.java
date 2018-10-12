package immutability;

public enum Price {
    PLN("ZL"),
    EURO("EU"),
    DOLARS("USD");

    String currency;

    Price(String currency) {
        this.currency = currency;

    }

    @Override
    public String toString() {
        return currency;
    }
}
