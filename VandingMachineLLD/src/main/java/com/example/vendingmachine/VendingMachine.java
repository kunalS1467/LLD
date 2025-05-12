package com.example.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    private List<Coin> coins;
    private Product product;

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void addAmount(Coin coin) {
        coins.add(coin);
    }
    public void setCoins() {
        coins = new ArrayList<>();
    }
}
