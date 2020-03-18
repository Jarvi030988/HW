package lesson5;

import java.util.Arrays;

public class HomeWorkStrings {
    public static void main(String[] args) {


//    1.Даны 2 слова, состоящие из четного числа букв.
//    Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        String string1 = "coronavirs";
        String string2 = "pandemix";
        String string3 = string1.substring(0, string1.length() / 2);
        StringBuilder sb = new StringBuilder(); //StringBuilder -> класс
        String string4 = string2.substring(string2.length() / 2, string2.length());
        sb.append(string3).append(string4);

//        sb.append(string3).append(string2.substring(0, string2.length()/2));
        String str5 = sb.toString();
        System.out.println("-----");
        System.out.println(str5);
        System.out.println("-----");

//    2.Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.

            String str1 = "I said not to Covid-19";
            String[] words = str1.split(" ");
            System.out.println("The longest word is: " + maxLengthWord(words));
        }
        private static String maxLengthWord (String[]str){
            int length = 0;
            String longest = "";
            for (String elem : str) {
                if (elem.length() > length) {
                    length = elem.length();
                    longest = elem;
                }
            }
            return longest;
            /*for (int i = 0; i < strings.length; i++) {
            str = strings[i];
            if (strings[i].length() >= strings[i+1].length()) {
                str = strings[i+1];
                System.out.println(str);*/
        }
}


//    3.Имеются две строки. Найти количество вхождений одной строки в другую.
//    4.Написать функцию, которая проверяет, является ли строка палиндромом.
//    Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
//    5.Даны два слова и словарь (массив слов). Необходимо найти алгоритм превращения в другое, меняя за один шаг одну букву,
//    причем каждое новое слово должно быть в словаре (массиве слов).
//    Например,даны слова "hit" и "cog" и словарь(массив слов) ["hot", "dot", "dog", "log", "lot"].
//    Один из вариантов цепочки: "hit"->"hot"->"dot"->"dog"->"cog".
//    6.Пользователь вводит названия городов через пробел. Вы их присваиваете переменной.
//    Переставьте названия так, чтобы они были упорядочены по алфавиту.*/




