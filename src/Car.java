public class Car {

    private String getBrand;
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;


    Car (String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

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
}
