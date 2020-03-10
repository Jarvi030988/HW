package lesson2;

import org.w3c.dom.ls.LSOutput;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
       /* 1.Найти наибольший общий делитель (НОД) двух чисел
        2.	Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
        Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Постарайтесь решить задачу наиболее оптимальным способом
        3.	Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
        4.	Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
        5.	Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        Вывести массив в консоль. После на отдельной строке вывести в консоль значение максимального
*/
//        1.Найти наибольший общий делитель (НОД) двух чисел
        /*Пример 2. Найдём наибольший общий делитель чисел 140 и 96:
        1) 140 : 96 = 1 (остаток 44)
        2) 96 : 44 = 2 (остаток 8)
        3) 44 : 8 = 5 (остаток 4)
        4) 8 : 4 = 2
        Последний делитель равен 4 – это значит, что НОД (140, 96) = 4.
        Последовательное деление так же можно записывать столбиком:*/

        Scanner in = new Scanner(System.in);
        int intVar1;
        int intVar2;
        while (true) {
            System.out.println("Введите целое число 1");
            intVar1 = in.nextInt();
            break;
        }

        while (true) {
            System.out.println("Введите целое число 2");
            intVar2 = in.nextInt();
            break;
        }

        while (true) {

            if (intVar1 == 0 || intVar2 == 0) {
                System.out.println("попробуйте еще");
                break;
            }

            if (intVar1 >= intVar2) {
                int res1 = intVar1 % intVar2;
                if (res1 == 0) {
                    System.out.println("наибольший общий делитель равен");
                    System.out.println(intVar2);
                    break;
                } else {
                    intVar1 = intVar2;
                    intVar2 = res1;

                }

            } else {
                int res1 = intVar2 % intVar1;
                if (res1 == 0) {
                    System.out.println("наибольший общий делитель равен");
                    System.out.println(intVar1);
                    break;
                } else {
                    intVar2 = intVar1;
                    intVar1 = res1;
                }
            }
        }
//        2.	Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
//        Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
//        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Постарайтесь решить задачу наиболее оптимальным способом
        int[] someArr = {12, 656, 97, 98, 32, 87, 1245, 3, 4, 0, 7};
        for (int i = 0; i < someArr.length; i++) {
            for (int j = 0; j < someArr.length; j++) {
                if (i <= j) {
                    if (someArr[i] + someArr[j] == 7) {
                        System.out.println("------");
                        System.out.println(someArr[i]);
                        System.out.println(someArr[j]);

                    }
                }


            }


        }
//       3. Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
        int N = 197;
        float[] someArr2;

        someArr2 = new float[N];
        float maxValue = -1000;
        float minValue = 1000;
        float sumValue = 0;

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] = (float) Math.random() * 197 + 1;
            if (someArr2[i] > maxValue) {
                maxValue = someArr2[i];
            }
            if (someArr2[i] < minValue) {
                minValue = someArr2[i];

            }
            sumValue = sumValue + someArr2[i];

        }
        System.out.println("максимальное значение");
        System.out.println(maxValue);
        System.out.println("минимальное значение");
        System.out.println(minValue);
        System.out.println("среднее значение");
        System.out.println(sumValue / N);

/*
        5.	Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].*/


        int[][] newArr3;
        newArr3 = new int[5][8];
        for (int i = 0; i < newArr3.length; i++) {
            for (int j = 0; j < newArr3[i].length; j++) {
                newArr3[i][j] = (int) (Math.random() * 199) - 99;
            }
        }
        System.out.println(Arrays.deepToString(newArr3));

//        4.Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
//        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
        Scanner in2 = new Scanner(System.in);
//        int n;

        while (true) {
            System.out.println("Введите целое число >3");
            int n = in.nextInt();
            if (n <= 3) {
                System.out.println("Повтори ввод");
                continue;

            }
            int[] newArr4;
            newArr4 = new int[n];
            int count = 0;
            for (int i = 0; i < newArr4.length; i++) {
                newArr4[i] = (int) (Math.random() * n + 1);
                if (newArr4[i] % 2 == 0) {
                    count = count + 1;
                    //считаем количество четных чисел
                }
            }

            if (count > 0) {
                int[] newArr6;
                newArr6 = new int[count];
                int count1 = 0;
                for (int i = 0; i < newArr4.length; i++) {
                    if (newArr4[i] % 2 == 0) {
                        newArr6[count1] = newArr4[i];
                        count1 = count1 + 1;
                    }
                }
                System.out.println(Arrays.toString(newArr6));
            }
            System.out.println(Arrays.toString(newArr4));

            break;
        }

    }
}

