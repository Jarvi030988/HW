package Converter;

public class ConvertToMax extends Converter{
//    T_max = T_C*2.0 + T_C^2 -> выдуманная единица температуры
    double cTemp;
    double maxTemp;

    public void convertValue(double temp) {
        cTemp = temp;
        maxTemp = temp * 2 + Math.pow(temp,2);

    }
    public double getMaxTemp(){
        return maxTemp;
    }
}
