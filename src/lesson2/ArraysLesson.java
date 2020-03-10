package lesson2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        //объявление переменной массива
        int[] someArr;
        //  int someArr; можно, но не нужно C-style
        // int - указываем тип данных массва
        // [] - указание, что это массива
        someArr = new int[7];
//        someArr = new int [7] - размер массива, который нельзя изменить
//        [ , , , , , , ]
//        по-умолчанию типа целых чисел [0,0,0,0,0,0,0]
//        для float/double [0,0]
//        boolean [false,false]
//        ссылочные типы [null]
        System.out.println(Arrays.toString(someArr));//обязательно из java.util
        //to string - преобразовать в строку
//        int [] someArr2 = {37, 48, 125, 983, -23, -112};//вариант если заранее знаем значения

//        int [][] someArr2 = {{37,33}, 48, 125, 983, -23, -112};//вариант если заранее знаем значения
//        int [][]
//                someArr = new int[7][3];
        int[] someArr2 = {37, 48, 125, 983, -23, -112};//вариант если заранее знаем значения
        System.out.println(Arrays.toString(someArr2));
        //размер массива нельзя изменить, но можно узнать

        System.out.println(someArr.length);//7
        System.out.println(someArr2.length);//7
        //доступ к элементам массива
        System.out.println(someArr2[4]);// -23
        System.out.println(someArr2[1 + 2]);//983
        System.out.println(someArr2[1] + someArr[6]);//48
//        System.out.println(someArr2[123]);

        someArr[2] = 456;
        System.out.println(Arrays.toString(someArr));//метод Arrays

        someArr = new int[23];
        someArr2 = new int[]{23, 1, -1, 5};//переопределяем массив

        for (int i = 0; i < someArr2.length; i++) {
            someArr[i] *= 2;
        }
        System.out.println(Arrays.toString(someArr2));

        someArr2 = new int[]{23, 1, -10, 5};
        //в elem скопируется значение №1,потом №2
        // в первой итерации скопир 23, потом 46, скопир 1,
        //мы берем значение переменной, но массив не меняется
        //это разница между for int и for int elem
        for (int elem : someArr2) {
            elem *= 2;
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(someArr2));

//      копирование массивов
        someArr2 = new int[]{23, 1, -10, 5};
//        int[] arr = someArr; - создание ссылки на сущ массив
        //это не копирование массива
        // это просто переназвали/на самом деле добавили второе имя
        //можем обращаться и по первому и по второму имени

        int[] cloneArr = someArr2.clone();

        //создали две независимые копии

        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[15];
        //изменяет массив,копируем данные из одного массива в другой
        System.arraycopy(someArr2, 1, someArr, 3, 2); //1-начиная с какого индекса мы копируем
        System.out.println(Arrays.toString(someArr));
//      ArrayIndexOutOfBoundsException
        int[] copyArr = Arrays.copyOf(someArr2, 3);
        System.out.println(Arrays.toString(copyArr));
        //обрезает до 3го элемента
        //не такой гибкий как ArrayCopy

        //сравнение массивов
        someArr2 = new int[]{23, 2, -10, 5};
        someArr = new int[]{23, 1, -10, 5};

        System.out.println(Arrays.equals(someArr, someArr2));
//        someArr == someArr2      ссылочные типы данных, нельзя использовать такой метод
//        someArr.equals(someArr2) ссылочные типы данных, нельзя использовать такой метод
        someArr = new int[]{12, -10, 123, 6};
        someArr2 = new int[]{23, 1, -10, 5};
        int[] resultArr = new int[4];

        for (int i = 0; i < someArr.length; i++) {
            resultArr[i] = someArr[i] + someArr2[i];

        }
        System.out.println(Arrays.toString(resultArr));


        //сортировка массива
        someArr = new int[]{12, -10, 123, 6};
        Arrays.sort(someArr); // сорт часть массива - Arrays.sort(arr, 1, 5);
        System.out.println(Arrays.toString(someArr));
//        может сортировать массив полн, может часть
//        происходит изменение массива
        //квиксорт посмотреть как в массиве физически сортируется и реализуется по коду
        //алгоритм быстрой сортировки, сложность алгоритма 0(n log n)
        //задача выбрать скорость работы алгоритма, а не разбираться в его работе

        //поиск в массиве.бинарный поиск сложность 0(n log n)
        someArr = new int[]{-10, 6, 12, 123};
        System.out.println(Arrays.binarySearch(someArr, 6)); //1, выводит индекс, а не сам элемент
        System.out.println(Arrays.binarySearch(someArr, 15));//-4

        //многомерные массивы
        //когла элементами массива явл другой массив
        int[][] newArr = new int[3][4]; //3-длина внешнего массива, по 4 элемента в 3 массивах
        System.out.println(Arrays.deepToString(newArr));

        int[][] newArr2 = {{1, 2, 3}, {4, 5}, {7}};
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr[0][2]);//3
        System.out.println(newArr2[1][1]); //5

        for (int i = 0; i < newArr2.length; i++) {
//            newArr[0] - {1, 2, 3} вложенный массив
            for (int j = 0; j < newArr2[i].length; j++) { //newArr2.length-идем до конца массива (согласно длине массива)
                newArr2[i][j] *= newArr2[i][j];
            }
        }


        System.out.println(Arrays.deepToString(newArr2));
        // дома подставлять значения и тренироваться с этим циклом


    }


}
