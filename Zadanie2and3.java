/*
    Задание 2:

    Ошибка деления на 0 (int d = 0;). Нужно изменить значение переменной d
     на ненулевое, например, 1.
    Исправленный код будет выглядеть так:

            try {
        int d = 1;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

    Задание 3:
    
    Ошибка в задании 3 - попыткa обращения к несуществующему
     индексу массива (abc[3] = 9;). Изменим индекс
     на существующий, например, 1. Нужно добавить
     import java.io.FileNotFoundException; исправленный код:

import java.io.FileNotFoundException;

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

*/
