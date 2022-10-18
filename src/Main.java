public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("Lada", "Grande", 2015, "Россия", "Желтый", 1.7);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "Красный", 2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6);


        System.out.println("Урок 2.1 ООП. Домашнее задание - 3.");
        printSeparator();

        ladaGrande.printCar();
        audiA8.printCar();
        bmwZ8.printCar();
        kiaSportage4.printCar();
        hyundaiAvante.printCar();


        printSeparator();
    }

    private static void printSeparator() {
        System.out.println("-----------------------------------------------------------");
    }
}