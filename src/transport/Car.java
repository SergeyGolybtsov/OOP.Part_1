package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;


    Car (String brand,
         String model,
         double engineVolume,
         String color,
         int productionYear,
         String productionCountry,
         String bodyType,
         int numberOfSeats) {

        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }

        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        if (color == "") {
            this.color = "белый";
        }

        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        if (brand == "") {
            this.brand = "default";
        }

        this.model = model;
        if (model == "") {
            this.model = "default";
        }
        if (model == null) {
            this.model = "default";
        }

        this.productionCountry = productionCountry;
        if (productionCountry == "") {
            this.productionCountry = "default";
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        }

        this.bodyType = bodyType;
        if (bodyType == null) {
            this.bodyType = "седан";
        }


    }


    public String toStringCarLada() {
        return  brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвета, обьем двигателя - " + engineVolume + " л.";
    }
    public String toStringCarAudi() {
        return brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, обьем двигателя - " + engineVolume + " л.";
    }
    public String toStringCarBmw() {
        return brand + " " + model + ", сборка в " + productionCountry + " в" + productionYear + " году, " + color + " цвет кузова, обьем двигателя - " + engineVolume + " л.";
    }
    public String toStringCarKia() {
        return brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ",  цвет кузова - " + color + ", обьем двигателя - " + engineVolume + " л.";
    }
    public String toStringCarHyundai() {
        return brand + " " + model + ", сборка в " + productionCountry + ", цвет кузова - " + color + ", обьем двигателя - " + engineVolume + " л, год выпуска - " + productionYear + " год.";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
