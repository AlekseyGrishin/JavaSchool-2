package com.bank;

import com.bank.application.CreditSystem;
import com.bank.application.Transfer;
import com.bank.entity.Client;
import com.bank.entity.Credit;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(50000, 2, 15);
        CreditSystem creditSystem = new CreditSystem();
        creditSystem.getCredit(new Client("Антон"), credit);
        creditSystem.repayCredit(credit, 15000);


        Client client1 = new Client(178L, "Иван", "Иванов",25, "мужской", "г.Самара", "89999999", 50000);
        Client client2 = new Client(172L, "Антон", "Иванов",25, "мужской", "г.Самара", "89999999", 40000);
        Transfer transfer = new Transfer();
        transfer.transferMoney(client1, client2, 15000);
    }
}
