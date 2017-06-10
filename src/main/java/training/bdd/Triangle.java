package training.bdd;

public class Triangle implements Shape {
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (int) (base * height * .5);
    }
}
