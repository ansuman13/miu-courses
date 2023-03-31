package test;

import java.util.Objects;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private Customer c1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(c1, that.c1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, c1);
    }


}
