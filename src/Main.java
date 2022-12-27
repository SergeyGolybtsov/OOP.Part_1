public class Main {
    public static void main(String[] args) {

        Car carLada = new Car("","Granta", 1.7, "желтого", 2015, "России");
        Car carAudi = new Car("Audi", "A8 50L TDI quattro", 3.0, "", 2020, "Германия");
        Car carBmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
        Car carHyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");

        System.out.println(carLada.toStringCarLada());
        System.out.println(carAudi.toStringCarAudi());
        System.out.println(carBmw.toStringCarBmw());
        System.out.println(carKia.toStringCarKia());
        System.out.println(carHyundai.toStringCarHyundai());
    }

}