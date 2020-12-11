package com.bank;

public class Transfer {
    public static void main(String[] args) {
        Credit credit = new Credit(50000, 2, 15);
        credit.getCredit(new Client("Антон"), credit);
        credit.repayCredit(credit, 15000);
    }
}
