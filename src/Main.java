import abstraction.Circle;
import abstraction.Shape;
import abstraction.Square;
import implementor.RasterRenderer;
import implementor.Renderer;
import implementor.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0);
        Shape square = new Square(rasterRenderer, 10.0);

        System.out.println("--- Initial Drawing ---");
        circle.draw();
        square.draw();

        System.out.println("\n--- Switching Implementation at Runtime ---");
        Shape rasterCircle = new Circle(rasterRenderer, 5.0);
        rasterCircle.draw();

        System.out.println("\n--- Resizing Shapes ---");
        circle.resize(2.0);
        circle.draw();
    }
}