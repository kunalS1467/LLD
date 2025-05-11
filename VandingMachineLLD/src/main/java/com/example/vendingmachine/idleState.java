package com.example.vendingmachine;

public class idleState implements State{
    @Override
    public void takeCoinsButton(VendingMachine vendingMachine) {
        System.out.println("The Vending Machine has been started.");
        vendingMachine.changeState(new HasMoneyState());
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
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
    public void dispenseButton(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }
}
