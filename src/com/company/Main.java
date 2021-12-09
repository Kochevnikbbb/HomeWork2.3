package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        //Boolean isHaveMoney = false;
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                int ostatok = (int) bankAccount.getAmount();
                try {
                    bankAccount.withDraw(ostatok);
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }

                break;
            }


        }

    }
}
