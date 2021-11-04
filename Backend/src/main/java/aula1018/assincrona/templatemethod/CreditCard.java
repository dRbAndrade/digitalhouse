package aula1018.assincrona.templatemethod;

import java.time.LocalDate;

public class CreditCard extends Card{

    private Double limit;
    private Double usedCredit;
    private Double availableCredit;

    public CreditCard(String number, String cvv, LocalDate expirationDate) {
        super(number, cvv, expirationDate);
        Double seed = Math.random();
        limit = (seed*5000-seed*1000)+1000;
        usedCredit = (seed*500-seed*100)+100;
        availableCredit = limit - usedCredit;

    }

    @Override
    public boolean pay(Double value) {
        if(value>availableCredit)return false;
        usedCredit+=value;
        availableCredit-=value;
        return true;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getUsedCredit() {
        return usedCredit;
    }

    public void setUsedCredit(Double usedCredit) {
        this.usedCredit = usedCredit;
    }

    public Double getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(Double availableCredit) {
        this.availableCredit = availableCredit;
    }
}
