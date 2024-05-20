package pl.javastart.task;

public class Room {
    double measure;
    double temperature;
    double minTemperature;
    boolean acMounted;

    public Room(double measure, double temperature, double minTemperature, boolean acMounted) {
        this.measure = measure;
        this.temperature = temperature;
        this.minTemperature = minTemperature;
        this.acMounted = acMounted;
    }

    boolean coolDown() {
        if (acMounted && temperature - 1 > minTemperature) {
            temperature--;
            return temperature - 1 < minTemperature;
        } else if (acMounted && temperature > minTemperature) {
            temperature = temperature - (temperature - minTemperature);
            return temperature == minTemperature;
        }
        return acMounted && temperature == minTemperature;
    }

}