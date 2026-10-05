package implementor;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("[Vector Renderer] Drawing a vector circle with radius %.2f%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("[Vector Renderer] Drawing a vector square with side %.2f%n", side);
    }
}