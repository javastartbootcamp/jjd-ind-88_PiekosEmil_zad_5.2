package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(15, 23, 19, true);
        Room room2 = new Room(17, 23, 21, false);
        Room room3 = new Room(12, 17, 19, true);

        System.out.println("Temperatura w pokoju nr 1: " + room1.temperature);
        room1.coolDown(); // 22
        room1.coolDown(); // 21
        room1.coolDown(); // 20
        room1.coolDown(); // 19
        room1.coolDown(); // 18 - to już się nie wykonuje
        room1.coolDown(); // 17 - to już się nie wykonuje
        System.out.println("Temperatura w pokoju nr 1: " + room1.temperature);
        System.out.println();

        System.out.println("Temperatura w pokoju nr 2: " + room2.temperature);
        room2.coolDown();
        room2.coolDown();
        room2.coolDown();
        room2.coolDown();
        System.out.println("Temperatura w pokoju nr 2: " + room2.temperature);
        System.out.println();

        System.out.println("Temperatura w pokoju nr 3: " + room3.temperature);
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        System.out.println("Temperatura w pokoju nr 3: " + room3.temperature);
        System.out.println();
    }
}
