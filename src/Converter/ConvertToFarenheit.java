package Converter;

public class ConvertToFarenheit extends Converter{
    double tempCelcius;
    double tempFarenheit;

    public void convertValue(double temp){
        tempCelcius = temp;
        tempFarenheit = 1.8 * temp + 32;
    }
    public double getConvertedValue(){
        return tempFarenheit;
    }
}
