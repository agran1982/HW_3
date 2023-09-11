package oop2;

public class BigCar implements Cars{
    @Override
    public int doorsQuantity() {
        return 4;
    }

    @Override
    public String bodyType() {
        return Cars.super.bodyType();
    }

    public String color() {
        return "baklajan";
    }
}
