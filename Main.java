package com.javauser.narfu.one;

public class Main {
    public static void main(String[] args) {
        Complex c2 = new Complex(5, 1);
        Complex c3 = new Complex(2,-3);
        Complex c4 = new Complex(2,-3);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);
        System.out.println("c4 = "+c4);
        System.out.println("c3 и c4 " + c3.equals(c4));
        System.out.println("c2 и c3 " + c2.equals(c3));
        System.out.println("c2 + c3 = " + c2.sum(c3));
        System.out.println("c2 - c3 = " + c2.sub(c3));

        System.out.println("c2 * c3 = " + c2.mult(c3));
        System.out.println("conj(c3) = " + c3.conj());
        System.out.println("c3 * conj(c3) = " + c3.mult(c3.conj()));
        System.out.println("c2 / c3 = " + c2.div(c3));
        System.out.println(c2.toTrigonometric());

        TrigComplex z1 = new TrigComplex(2, Math.PI / 4);
        TrigComplex z2 = new TrigComplex(3, Math.PI / 3);

        // Сложение
        System.out.println("z1 + z2 = " + z1.add(z2));

        // Вычитание
        System.out.println("z1 - z2 = " + z1.sub(z2));

        // Умножение
        System.out.println("z1 * z2 = " + z1.mult(z2));

        // Деление
        System.out.println("z1 / z2 = " + z1.div(z2));

        // Возведение в степень
        System.out.println("z1 ^ 2 = " + z1.pow(2));

        // Проверка на равенство
        System.out.println("z1 и z2 " + z1.equals(z2));
        System.out.println(z1.toAlgebraic());
    }
}
