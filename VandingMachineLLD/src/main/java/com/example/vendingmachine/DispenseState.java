package com.example.vendingmachine;

public class DispenseState implements State{
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
        System.out.println("Yu cant do it.");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine) {
        System.out.println("Yu cant do it.");
    }

    @Override
    public void dispenseButton(VendingMachine vendingMachine, int codeNumber) {
        System.out.println("You have got your drink.");
        vendingMachine.setState(new IdleState());
    }
}
