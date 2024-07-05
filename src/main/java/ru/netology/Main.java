package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String bin1 = "10110"; // 22 in decimal
        String bin2 = "11001"; // 25 in decimal

        System.out.println("Sum: " + bins.sum(bin1, bin2));   // Output should be 10110 (22 in decimal)
        System.out.println("Mult: " + bins.mult(bin1, bin2)); // Output should be 1111000 (120 in decimal)
    }
}