package com.example.vendingmachine;

public class IdleState implements State{

    @Override
    public void takeCoinsButton(VendingMachine vendingMachine)
    {
        vendingMachine.
        System.out.println("The Vending Machine has been started.");
        vendingMachine.changeState(new HasMoneyState());
    }
    /*
        These methods are not a part of the current state.
    */
    @Override
    public void insertCoins(VendingMachine vendingMachine, Coin coin) {
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
    public void dispenseButton(VendingMachine vendingMachine, int codeNumber) {
        System.out.println("Yu cant do it.");
    }
}
