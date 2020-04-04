package Converter;

public interface BasicConverter {
    public static Converter returnConverter(String type) {
        if (type == "FR") {
            return new ConvertToFarenheit();
        }
        if (type == "KL") {
            return new ConvertToKelvin();
        }
        if (type == "TM") {
            return new ConvertToMax();
        }
        return new ConvertToFarenheit();
    }
}