package lesson2;

public class Conditions {
    //    main/psvm
    public static void main(String[] args) {
        /* *//*if else        * *//*
        if (условие) {
            код выполняется, если условие истинно true;
        }else if (условие2) {
            код выполняется, если условие2 true;
        }else {
            код выполняется, если все условия false;*/
    /*
        в переменной minute Лежит число от 0 до 59
        в какую четверть часа попадает данное число
        ответ в консоль
        */

        int aMin = 34;
        if (aMin >= 0 && aMin <= 14) {
            System.out.println("Первая четверть");
        } else if (aMin >= 15 && aMin <= 30) {
            System.out.println("Вторая четверть");
        } else if (aMin >= 31 && aMin <= 45) {
            System.out.println("Третья четверть");
        } else if (aMin >= 46 && aMin <= 59) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("вне диапазона");
        }
//        swich () {}
        int code = 222;
//        111/222/333 - > "Малый приз"
//        444/555- > "Средний приз"
//        777 - > "Крупный приз"
//            - > "Try more"
        switch (code) {
            case 111:
            case 222:
            case 333:
                System.out.println("Small prize");
                break;
            case 444:
            case 555:
                System.out.println("Normal prize");
                break;
            case 777:
                System.out.println("Big prize");
                break;
            default:
                System.out.println("Try later");
        }
      //переменная сравнивается с case (и группировка по кейсам)
//        switch 12/13
        code = 123;
        switch (code) {
            case 111, 222, 333 -> System.out.println("Small prize");
            case 444, 555 -> System.out.println("Normal prize");
            case 777 -> System.out.println("Big prize");
            default -> System.out.println("Try later");
        }
        code = 123;
        String prize = switch (code) {
            case 111, 222, 333 -> "Small prize";
            /*case 444, 555 -> System.out.println("Normal prize");
            case 777 -> System.out.println("Big prize");*/
            default ->"Try later";
        };

        code = 123;
        prize = switch (code) {
            case 111, 222, 333 -> "Small prize";
            /*case 444, 555 -> System.out.println("Normal prize");
            case 777 -> System.out.println("Big prize");*/
            default -> {
                String someRes = "Try later";
                yield someRes; // J13
//                break someRes; // J12

            }


        };


    }
}








