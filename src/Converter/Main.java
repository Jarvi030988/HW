package Converter;


public class Main {
    public static void main(String[] args) {
        //создать объект в цельсиях и вывести это значение
        ConvertToKelvin converter1 = new ConvertToKelvin();
        converter1.convertValue(30.3);
        System.out.println("Температура в Кельвинах " + converter1.getConvertedValue());

        ConvertToKelvin converter2 = new ConvertToKelvin();
        converter2.convertValue(0.0);
        System.out.println("Температура в Кельвинах " + converter2.getConvertedValue());

        ConvertToFarenheit converterF1 = new ConvertToFarenheit();
        converterF1.convertValue(10.4);
        System.out.println("Температура в Фаренгейтах = " + converterF1.getConvertedValue());




        ConvertToMax converterMax1 = new ConvertToMax();
        converterMax1.convertValue(2);
        System.out.println("Температура по Максу = " + converterMax1.getMaxTemp());

        Converter bs = BasicConverter.returnConverter("KL");
        bs.convertValue(10.4);
        System.out.println("Температура =" + bs.getConvertedValue());





    }
}
