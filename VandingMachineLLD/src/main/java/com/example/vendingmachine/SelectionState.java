package com.example.vendingmachine;

public class SelectionState implements State{

    @Override
    public void takeCoinsButton(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

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
        System.out.println("The money has been refunded back to user");
        vendingMachine.setCoins();
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseButton(VendingMachine vendingMachine, int codeNumber) {
        System.out.println("Yu cant do it.");
    }
}
