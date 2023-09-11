package oop2;

public class CarExtendsAbstract extends  Abstract{
    @Override
    public int doorsQuantity() {
        return 4;
    }

    @Override
    public String bodyType() {
        return "sedan";
    }
}
