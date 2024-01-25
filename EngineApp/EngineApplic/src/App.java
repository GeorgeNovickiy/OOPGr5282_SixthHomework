public class App {
    public static void main(String[] args) throws Exception {
        // Создаем объект бензинового двигателя, реализующего интерфейс Engine
        Engine petrolEngine = new PetrolEngine();

        // Создаем объект автомобиля, передавая ему объект двигателя
        Car car = new Car(petrolEngine);

        // Запускаем автомобиль, что вызывает запуск двигателя
        car.start();
    }
}
