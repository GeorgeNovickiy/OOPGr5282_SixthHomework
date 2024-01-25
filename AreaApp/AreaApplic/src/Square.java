// Класс, представляющий квадрат
public class Square {
    private int side;

    // Метод для установки длины стороны квадрата
    public void setSide(int side) {
        this.side = side;
    }

    // Метод для вычисления площади квадрата
    public int area() {
        return this.side * this.side;
    }
}