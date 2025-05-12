package com.example.vendingmachine;

public interface State {
    void takeCoinsButton(VendingMachine vendingMachine);
    void insertCoins(VendingMachine vendingMachine, Coin coin);
    void selectProductButton(VendingMachine vendingMachine);
    void cancelDispense(VendingMachine vendingMachine);
    void chooseProduct(VendingMachine vendingMachine);
    void dispenseButton(VendingMachine vendingMachine,int codeNumber);
}
