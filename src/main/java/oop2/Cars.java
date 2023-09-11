package oop2;

public interface Cars {
    public int doorsQuantity();

    public default String bodyType() {
        return "sedan";
    }

    ;

    public default String model() {
        return "Lada";
    }

    ;
}
