// Класс, представляющий прямоугольник
public class Rectangle {
    private int width;
    private int height;

    // Метод для установки ширины прямоугольника
    public void setWidth(int width) {
        this.width = width;
    }

    // Метод для установки высоты прямоугольника
    public void setHeight(int height) {
        this.height = height;
    }

    // Метод для вычисления площади прямоугольника
    public int area() {
        return this.width * this.height;
    }
}