public class Car {
    String brand;
    String model;
    int productionYear;
    String productionCountry;
    String color;
    double engineVolume;

    Car (String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    void printCar() {
            System.out.println(brand + " " + model + ":\n" +
                    "  - Год выпуска: " + productionYear + "\n" +
                    "  - Сборка: " + productionCountry + "\n" +
                    "  - Цвет кузова: " + color + "\n" +
                    "  - Объем двигателя: " + engineVolume + " литра");
        }

}
