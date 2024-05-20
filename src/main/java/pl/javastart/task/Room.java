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
/* Metoda powinna zwracać true, jeżeli udało się obniżyć temperaturę,
lub false jeżeli w pokoju nie ma klimatyzatora
lub osiągnięto temperaturę graniczną.
 */

    void coolDown() {
        if (acMounted) {
            if (temperature > minTemperature) {
                if (temperature - 1 > minTemperature) {
                    temperature--;
                } else {
                    temperature = temperature - (temperature - minTemperature);
                }
            }
        }
    }

    boolean coolDownIsPossible() {
        if (!(acMounted && temperature > minTemperature || temperature != minTemperature)) {
            return true;
        } else if (acMounted && temperature > minTemperature) {
            if (temperature < minTemperature) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
//return acMounted && temperature < minTemperature;