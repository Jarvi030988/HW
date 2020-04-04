package Converter;

public class ConvertToKelvin extends Converter{
    double tempCelsius;
    double tempKelvin;

    public void convertValue(double temp) {
//t_{C}=t_{K}-273,15 (температура тройной точки воды +0,01 °C).
        tempCelsius = temp;
        tempKelvin = temp + 273.15;
    }
    public double getConvertedValue(){
        return tempKelvin;
    }
}
