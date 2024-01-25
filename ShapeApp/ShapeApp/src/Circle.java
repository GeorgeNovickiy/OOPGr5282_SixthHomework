// Класс представляющий круг
public class Circle implements TwoDimensionalShape {
    private double radius;

    // Конструктор принимающий радиус круга
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода для вычисления площади круга
    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}