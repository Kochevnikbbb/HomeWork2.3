package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {   //возвращает текущий остаток на счете
        return amount;
    }


    public void deposit(double sum) {     //положить деньги на счет
        amount += sum;
        System.out.println("вы положили: " + sum + "сом На вашем счете: " + getAmount());
    }

    public void withDraw(int sum) throws LimitException {       //снимает указанную сумму со счета
        if (sum > amount) {
            throw new LimitException("Вы не можете снять наличные, так как вы хотите снять больше чем у вас есть ", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " Остаток на счете: " + getAmount());
        }
    }
}
