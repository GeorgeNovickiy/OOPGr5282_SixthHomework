// Класс представляющий куб
public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private int edge;

    // Конструктор принимающий длину ребра куба
    public Cube(int edge) {
        this.edge = edge;
    }

    // Реализация метода для вычисления площади куба
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    // Реализация метода для вычисления объема куба
    @Override
    public double volume() {
        return Math.pow(edge, 3);
    }
}