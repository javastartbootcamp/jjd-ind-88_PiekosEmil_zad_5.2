package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(15, 23.7, 19.5, true);
        Room room2 = new Room(17, 23, 21, false);
        Room room3 = new Room(12, 17, 19, true);
        Room room4 = new Room(10, 20, 19, true);

        System.out.println("Temperatura w pokoju nr 1: " + room1.temperature);
        room1.coolDown();
        //room1.coolDown();
        room1.coolDown();
        System.out.println("Obniżona temperatura: " + room1.temperature);
        room1.coolDown();
        room1.coolDown();
        System.out.println("Temperatura w pokoju nr 1: " + room1.temperature);
        System.out.println("Czy udało się obniżyć temperaturę? : " + room1.coolDownIsPossible());
        System.out.println();

        System.out.println("Temperatura w pokoju nr 2: " + room2.temperature);
        room2.coolDown();
        room2.coolDown();
        room2.coolDown();
        room2.coolDown();
        room2.coolDown();
        System.out.println("Temperatura w pokoju nr 2: " + room2.temperature);
        System.out.println("Czy udało się obniżyć temperaturę? : " + room2.coolDownIsPossible());
        System.out.println();

        System.out.println("Temperatura w pokoju nr 3: " + room3.temperature);
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        room3.coolDown();
        System.out.println("Temperatura w pokoju nr 3: " + room3.temperature);
        System.out.println("Czy udało się obniżyć temperaturę? : " + room3.coolDownIsPossible());
        System.out.println();

        System.out.println("Temperatura w pokoju nr 4: " + room4.temperature);
        System.out.println("Temperatura w pokoju nr 3: " + room4.temperature);
        System.out.println("Czy udało się obniżyć temperaturę? : " + room4.coolDownIsPossible());
        System.out.println();
    }
}
