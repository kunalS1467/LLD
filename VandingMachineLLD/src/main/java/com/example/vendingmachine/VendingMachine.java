package com.example.vendingmachine;

public class VendingMachine {
    private State state;

    public void changeState(State state) {
        this.state = state;
    }
}
