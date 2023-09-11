package oop2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SmallCar smallCar = new SmallCar();
        System.out.println("\n" + smallCar.doorsQuantity());
        System.out.println(smallCar.model());
        System.out.println(smallCar.bodyType());
        System.out.println(smallCar.color());

        BigCar bigCar = new BigCar();
        System.out.println("\n" + bigCar.doorsQuantity());
        System.out.println(bigCar.model());
        System.out.println(bigCar.bodyType());
        System.out.println(bigCar.color());

        Cars cars = new Cars() {
            @Override
            public int doorsQuantity() {
                return 4;
            }
        };
        System.out.println("\n" + cars.doorsQuantity());
        System.out.println(cars.bodyType());

    }


}
