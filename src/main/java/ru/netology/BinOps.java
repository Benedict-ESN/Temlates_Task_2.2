package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
//      System.out.println( "num1: " + num1 + " + num2: " + num2 + " = "+ (num1 + num2) );
        int result = num1 + num2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
//      System.out.println( "num1: " + num1 + " * num2: " + num2 + " = "+ (num1 * num2) );
        int result = num1 * num2;
        return Integer.toBinaryString(result);

    }
}
