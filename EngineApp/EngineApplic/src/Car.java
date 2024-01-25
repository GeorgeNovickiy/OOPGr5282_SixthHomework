// Класс, представляющий автомобиль
public class Car {
    private Engine engine;

    // Конструктор, принимающий объект класса, реализующего интерфейс Engine
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Метод для запуска двигателя
    public void start() {
        this.engine.start(); // Вызов метода start() у объекта, реализующего интерфейс Engine
    }
}
