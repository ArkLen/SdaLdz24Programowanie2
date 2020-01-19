package Basic6Polymorphism;

public class Motorbike implements Vehicle {

    private static final int MAX_SPEED = 300;
    private int speed = 0;

    public Motorbike(int speed) {
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        int zwiększPrędkość = 30;
        if (speed + zwiększPrędkość > MAX_SPEED) {
            System.out.println("Pojazd nie może przyspieszyć! Maksymalna prędkość: " + MAX_SPEED);
        } else {
            speed = speed + zwiększPrędkość;
        System.out.println(speed);
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
