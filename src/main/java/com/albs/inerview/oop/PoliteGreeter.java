package com.albs.inerview.oop;

public class PoliteGreeter extends Greeter {

    public String greet(Integer i) {
        return "polite:Integer";
    }

    @Override
    public String who() {
        return "polite";
    }
}


