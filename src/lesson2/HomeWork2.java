package lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
//       /* Массивы
//        Задача 1
//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2).
        int[] someArr;
        someArr = new int[10];
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                someArr[count] = i;
                count = count + 1;
            }

        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(someArr[i]);

        }
//        Задача 2
//        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//        Выведите массив в консоль.
//        Подсчитайте сколько в массиве чётных элементов и выведете это количество в консоль.
        int[] someArr2;
        someArr2 = new int[15];

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] = (int) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(someArr2));

        int count2 = 0;

        for (int i = 0; i < someArr2.length; i++) {
            if (someArr2[i] % 2 == 0) {

                count2 = count2 + 1;

            }

        }
        System.out.println(count2);

//        Задача 3
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его в консоль.
//        Определить и вывести в консоль сообщение о том, является ли массив строго возрастающей последовательностью.
        int[] someArr3 = new int[4];
        boolean someVar1 = true;

        for (int i = 0; i < someArr3.length; i++) {
            someArr3[i] = (int) (Math.random() * 90) + 10;
            System.out.println(someArr3[i]);
        }
        for (int i = 0; i < someArr3.length; i++) {
            if (i > 0) {
                if (someArr3[i - 1] > someArr3[i]) {
                    someVar1 = false;
                    break;
                }
            }
        }
        if (someVar1 == true) {

            System.out.println("Массив является строго возрастающей посл");
        } else {
            System.out.println("Массив не является строго возрастающей посл");
        }

//                Задача 4
//        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
//        Определите какой элемент встречается в массиве чаще всего и выведите об этом в консоль.
//        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/
        int[] someArr4 = new int[11];
        int count1 = 0;
        int count0 = 0;
        int count_1 = 0;

        for (int i = 0; i < someArr4.length; i++) {
            someArr4[i] = (int) (Math.random() * 3) - 1;
            if (someArr4[i] == 1) {

                count1 = count1 + 1;
            }
            if (someArr4[i] == 0) {

                count0 = count0 + 1;
            }
            if (someArr4[i] == -1) {

                count_1 = count_1 + 1;
            }
        }
        System.out.println(Arrays.toString(someArr4));

        if ((count1 > count0) && (count1 > count_1)) {
            System.out.println("Чаще 1");
        }
        if ((count0 > count1) && (count0 > count_1)) {
            System.out.println("Чаще 0");
        }
        if ((count_1 > count0) && (count_1 > count1)) {
            System.out.println("Чаще -1");
        }


//        Многомерные массивы
//        Задача 1
//        Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив в консоль.

        int[][] newArr8 = new int[8][5];
        for (int i = 0; i < newArr8.length; i++) {
            for (int j = 0; j < newArr8[i].length; j++) {
                newArr8[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(newArr8));


//        /*Задача 2
//        Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив в консоль.
//        Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
//                Если таких строк несколько, то вывести индекс первой встретившейся из них.
//        индекс первой встретившейся строки с наибольшим по модулю произведением элементов
        int[][] newArr10 = new int[7][4];
        int[] multiRows = new int[7];

        for (int i = 0; i < newArr10.length; i++) {
            multiRows[i] = 1;
            for (int j = 0; j < newArr10[i].length; j++) {
                newArr10[i][j] = (int) (Math.random() * 11) - 5;
//                multiRows[i] = Math.abs(multiRows[i] * newArr10[i][j]);
                multiRows[i] = multiRows[i] * newArr10[i][j];

            }
            multiRows[i] = Math.abs(multiRows[i]);
        }
        System.out.println(Arrays.toString(multiRows));
        System.out.println("---------------");
        System.out.println(Arrays.deepToString(newArr10));

        int maxValue = -10000;
        int maxIndex = -11;
        for (int i = 0; i < multiRows.length; i++) {
            if (multiRows[i] > maxValue) {
                maxValue = multiRows[i];
                maxIndex = i;

            }

        }
        System.out.println("индекс первой встретившейся строки с наибольшим по модулю произведением элементов " + maxIndex);
        //        Задача 3
//        Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив в консоль.
//        Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
//        При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
//        Порядок остальных элементов строки не имеет значения (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
//                Вывести преобразованный массив в консоль.    */
        int[][] newArr13 = new int[7][6];
        int maxValue2 = -10000;
        int maxIndex2 = -11;
        int temp = 10_000;
        for (int i = 0; i < newArr13.length; i++) {

            for (int j = 0; j < newArr13[i].length; j++) {
                newArr13[i][j] = (int) (Math.random() * 10);

            }
        }
        System.out.println(Arrays.deepToString(newArr13));

        for (int i = 0; i < newArr13.length; i++) {

            maxValue2 = -10000;
            maxIndex2 = -11;
            for (int k = 0; k < newArr13[i].length; k++) {
                if (newArr13[i][k] > maxValue2) {
                    maxValue2 = newArr13[i][k];
                    maxIndex2 = k;
                }
            }
            temp = newArr13[i][0];
            newArr13[i][0] = newArr13[i][maxIndex2];
            newArr13[i][maxIndex2] = temp;

        }
        System.out.println(Arrays.deepToString(newArr13));
    }
}





