package com.example.vendingmachine;

public class HasMoneyState implements State{
    @Override
    public void takeCoinsButton(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, Coin coin) {
        System.out.println("The coin has been added to the machine."+coin);
        vendingMachine.addAmount(coin);
    }

    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
         vendingMachine.changeState(new SelectionState());
    }

    @Override
    public void cancelDispense(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

    @Override
    public void dispenseButton(VendingMachine vendingMachine, int codeNumber) {
        System.out.println("Yu cant do it.");
    }
}
