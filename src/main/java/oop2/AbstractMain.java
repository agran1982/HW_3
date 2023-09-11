package oop2;

public class AbstractMain {
    public static void main(String[] args) {
        Abstract car = new Abstract() {
            @Override
            public int doorsQuantity() {
                return 0;
            }
        };

        CarExtendsAbstract carExtendsAbstract = new CarExtendsAbstract();{
            System.out.println("\n" + carExtendsAbstract.bodyType());
            System.out.println(carExtendsAbstract.doorsQuantity());
        }
    }
}
