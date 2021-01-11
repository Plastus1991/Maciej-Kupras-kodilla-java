package com.kodilla.kodillacourse;

public class Calculator {
    public int add(int a, int b) {
        int add = a + b;
        return add;
    }
    public int subtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

}
class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int add = calc.add(4,6);
        System.out.println(add);

        int subtract = calc.subtract(45, 65);
        System.out.println(subtract);

    }
}