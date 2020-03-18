package lesson5;

import java.util.Arrays;

public class HomeWorkStrings {
    public static void main(String[] args) {


//       1.Даны 2 слова, состоящие из четного числа букв.
//      Получить слово состоящее из первой половины первого слова и второй половины второго слова.
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

//        4.Написать функцию, которая проверяет, является ли строка палиндромом.
//        Палиндром — это слово или фраза, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.

        String s = "nononon";
        boolean bool1 = true;
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length() / 2; ++i) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    bool1 = false;
                }
            }
        } else {
            for (int i = 0; i < (s.length() - 1) / 2; ++i) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    bool1 = false;
                }
            }
        }
        if (bool1 == false) {
            System.out.println("Not a polyndrom");
        } else {
            System.out.println("Is polyndrom");
        }


//    2.Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.

        String str1 = "I said not to Covid-19";
        String[] words = str1.split(" ");
        System.out.println("In " + Arrays.toString(words));
        System.out.println("the longest word is: " + maxLengthWord(words));
    }

    public static String maxLengthWord(String[] str) {
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
            if (strings[i].length() == maxLenght) {
                str = strings[i+1];
                System.out.println(str);*/

    }
}











