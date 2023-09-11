package oop2;

public class SmallCar extends BigCar {
    public String bodyType() {
        return "coupe";
    }

    public String model() {
        return "BMV";
    }

    ;

    @Override
    public int doorsQuantity() {
        return 2;
    }

    @Override
    public String color() {
        return "red";
    }

}
