package Basic6Polymorphism;

public class Rocket implements Vehicle {

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    public Rocket(int speed) {
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        int zwiększPrędkość = 10000;
        if (speed + zwiększPrędkość > MAX_SPEED){
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
