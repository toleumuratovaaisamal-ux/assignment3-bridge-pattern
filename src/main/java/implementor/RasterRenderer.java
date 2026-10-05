package implementor;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("[Raster Renderer] Drawing a raster circle (pixels) with radius %.2f%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("[Raster Renderer] Drawing a raster square (pixels) with side %.2f%n", side);
    }
}