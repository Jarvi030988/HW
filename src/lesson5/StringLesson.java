package lesson5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
        //строки - ссылочный тип данных
        //строки до 9 Java
        char charVar = 'e';
        String someStr = "jjd";
        //тип данных String
        char[] chars = {'j','j','d'};
        // строки хранятся как массив char
        //в кодировке UTF-16
        // каждый символ занимает 2 байта

        //Строки (компактные строки) с 9 Java
        //строки хранятся как массив byte[]
        //UTF-16
        //LATIN-1
        String string = "Some string";                       //предпочтительный для простого создания строки
        String string4 = "Some string";                       //предпочтительный для простого создания строки
        String string2 = new String("Some string"); //сложный чз конструктор
        String string3 = new String("Some string"); //сложный чз конструктор

        //сравнение строк
        //== -> сравниваем ссылки на строчки
        System.out.println(string == string4);
        System.out.println(string2 == string3);             //не предпочтительный

        //сравниваем строчки String как массивы методом equals значения, а не ссылки
        System.out.println(string2.equals(string3));

        String newString = new String("new");
        String newString2 = newString.intern();
        //intern помещает строчку в пул строк если ее еще небыло
        // если есть - ссылка создает еще одну
        System.out.println(string2 == string3);
        System.out.println(string2.intern() == string3.intern());

        //Строки неизменны и потокообразны
        //если меняем -> то появляется еще одна строка, прежняя будет лежать

        //Конкатенация строк
        String str1 = "строка 1";
        String str2 = "строка 2";
        String str3 = "строка 3";

        str1 = str1 + str2 + "  ";
        System.out.println(str1);

        //метод concat
        //каждый вызов метода + и concat - создание новой строки
        str2 = str2.concat(str3).concat("Hello").concat("STR");

        System.out.println("Some data"); //строка Some Data => положили в пул строк и при вызове он возвращает ссылку на нее
//        str3 = String//обращаемся к классу String
        str3 = String.join(" :: ", str1, str2, str3);
        System.out.println(str3);

        //переопределяем строки
        str1 = "Cтрока";
        for (int i = 0; i < 10; i++) {
            str1 += "итерация" + i;
        }
        System.out.println(str1);
        //при сложении большого количества строк ни + ни concat не используется

        //вместо них
        // возможность изменения
        //возможность изменять строки дают объекты
//        StringBuilder или StringBuffer
//        StringBuilder или StringBuffer одинаково работают
       /* StringBuilder - работает быстрее, но непотокобезопасен
          StringBuffer - работает медленнее, но потокобезопасен*/
          // StringBuilder и StringBuffer это не строки, это классы
        str1 = "Cтрока";
        StringBuilder sb = new StringBuilder(); //StringBuilder -> класс
//        StringBuilder sb = new StringBuilder(str1); //StringBuilder -> класс
        sb.append(str1).append("Hello");
        //не склеиваем строки, просто меняем существующий sb
        for (int i = 0; i < 10; i++) {
            sb.append("итерация").append(i);
        }
        //метод append
        str1 = sb.toString();
        //выводим все насобранные в StrB строчки
        System.out.println(str1);

        char[] charArr = {'q', 'w', 'e'};
        // из массива  байтов создаем строки
        String charStr = new String(charArr);

        //ниже возможна передача кодировки
        //собираем строчку из байтов
        byte[] bytes = charStr.getBytes();

        charStr = new String(bytes);

        //посмотреть таблицу  с кодировкой символов
        //сравнение
        str1 = "Java";
        str2 = "java";
        System.out.println(str1.equals(str2)); //этот метод сравнивает с учетом регистра
        System.out.println(str1.equalsIgnoreCase(str2)); //этот метод сравнивает без учета регистра

        //возвр либо отриц,либо полож, либо 0 (возвращает число)
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        //если строчки равны compareTo-> возвращает 0
//      сравнивается посимвольно, если наткнулось на расхождения -> останавливает работу

        str1 = "Java";
        System.out.println(str1.startsWith("Ja"));
        System.out.println(str1.endsWith("A"));

        str1 = string.toLowerCase();
        System.out.println(str1);
        str1 = string.toUpperCase();
        System.out.println(str1);

        str1 = "    Стр c  ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        System.out.println(str1.trim());
        //метод trim, не убирает промежуточные пробелы, только в начале или в конце

        str1 = "Java";
        String newS = str1.replace("a", "AA");
        str1 = str1.replace("a", "AA");// заменяет и мы не можем обратиться к новой ссылке

        System.out.println(str1.replace("a", "AA"));
        String newS1 = str1.replace("a", "AA"); // не заменяет и мы можем обратиться к новой ссылке,
        //создаем новую

        str1 = "Java Junior";
        String[] strings = str1.split("\\s");
        System.out.println(Arrays.toString(strings));

        //split -> разбиваем строку и получаем массив

        // посмотреть дома что такое регулярные выражения
        // и правила составления регулярных выражений
        // актуальное количество методов читать только в документации к версии Java
        //Metod Summar
        //искать метода-> метод, версия Java + docs
        // статья в документации всегда вернее ворумов и обсуждений









    }
}
