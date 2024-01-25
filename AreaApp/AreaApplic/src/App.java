public class App {
    public static void main(String[] args) throws Exception {
        // Пример использования класса Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println("Площадь прямоугольника: " + rectangle.area()); // Выводит площадь прямоугольника

        // Пример использования класса Square
        Square square = new Square();
        square.setSide(7);

        System.out.println("Площадь квадрата: " + square.area()); // Выводит площадь квадрата
    }
    }
