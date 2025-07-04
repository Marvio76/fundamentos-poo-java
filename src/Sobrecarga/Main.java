package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));         // chama somar(int, int)
        System.out.println(calc.somar(2.5, 3.2));     // chama somar(double, double)
        System.out.println(calc.somar(1, 2, 3));      // chama somar(int, int, int)
    }
}

