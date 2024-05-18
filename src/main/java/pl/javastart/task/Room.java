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

    void coolDown() {
        if (acMounted && (temperature > minTemperature)) {
            temperature--;
        }
    }
}
