package training.bdd;

public class Square implements Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        if (sideLength <= 0) throw new IllegalArgumentException("Square side length must be positive");
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}
