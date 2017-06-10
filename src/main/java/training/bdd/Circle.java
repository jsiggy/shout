package training.bdd;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
