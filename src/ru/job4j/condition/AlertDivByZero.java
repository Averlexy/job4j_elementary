package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-4);
        possibleDiv(0);
    }

    public static void possibleDiv(int namber) {
        if (namber < 0) {
            System.out.println("This is negative numbers ");
        }
    }
}
