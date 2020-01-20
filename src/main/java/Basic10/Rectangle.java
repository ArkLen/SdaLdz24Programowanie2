package Basic10;

public class Rectangle {
    private int widht;
    private int height;


    public Rectangle(int widht, int height) {

        if (widht < 0 || height < 0) {
            throw new IllegalArgumentException("Widht and hight must be > 0");
        }
        this.widht = widht;
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public int getHeight() {
        return height;
    }


    int calculateArea() {
        return widht * height;
    }

    int calculatePerimeter() {
        return (widht + height) * 2;
    }

}
