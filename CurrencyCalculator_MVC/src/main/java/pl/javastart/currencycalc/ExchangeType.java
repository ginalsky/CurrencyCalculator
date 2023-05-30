package pl.javastart.currencycalc;

import java.math.BigDecimal;

public enum ExchangeType {
    EURPLN("eur", "zł", new BigDecimal("4.3")),
    PLNEUR("zł", "eur", new BigDecimal("0.23"));

    private String baseCurrency;
    private String targetCurrency;
    private BigDecimal exchangeRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    ExchangeType(String baseCurrency, String targetCurrency, BigDecimal exchangeRate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
    }
}
