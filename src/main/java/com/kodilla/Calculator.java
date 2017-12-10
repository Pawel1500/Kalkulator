package com.kodilla;

public class Calculator {

    public void plusMethod () {
        System.out.println("Dodawanie");
    }

    public void minusMethod () {
        System.out.println("Odejmowanie");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator ();
        calculator.plusMethod ();
    }
    }

