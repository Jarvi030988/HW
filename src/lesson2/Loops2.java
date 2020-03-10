package lesson2;

import java.util.Scanner;

public class Loops2 {
    //    psvm
    public static void main(String[] args) {
        // циклы
//        while (условие){
//            тело цикла
//        }
        // пользователь вводит целое число с клавиатуры
        // необходимо вывести число * на себя
        // цикл прерывает свою работу, если пользователь ввел 0
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Введите целое число");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("Выход из программы");
                break;
            }
            System.out.println(num * num);
        }

        /*// Программа загадывает число в диапазоне [1;6]
        // Пользователь вводит число
        Программа в зависимости от введенного числа выводит
        в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        0 "выход из программы" (программа завершает работу)*/
        int programNum = (int) (Math.random() * 6) + 1;
        Scanner scanner = new Scanner(System.in);

        /*while (programNum<3, programNum>0 ){
            System.out.println("Введите целое число");
            int num = scanner.nextInt();
            if (num == 0){
                System.out.println("Выход из программы");
                break;
            }else if (num == programNum){
                System.out.println("Вы угадали");
                break;
            }else if (num < programNum){
                System.out.println("Загаданное число больше");
            }else{
                System.out.println("Загаданное число меньше");
            }
        }*/

//        for
        // вывести в консоль все четные числа от 0 до 19
        for (int i = 0; i <= 19; i++) {// fori
            if (i % 2 != 1) continue;


            System.out.println(i);

        }

    }
}