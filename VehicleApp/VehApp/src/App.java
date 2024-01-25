public class App {
    public static void main(String[] args) throws Exception {
       // Создание объектов автомобиля и автобуса
       Vehicle car = new Car(120);
       Vehicle bus = new Bus(80);

       // Вывод разрешенной скорости для каждого транспортного средства
       System.out.println("Разрешенная скорость для автомобиля: " + car.calculateAllowedSpeed());
       System.out.println("Разрешенная скорость для автобуса: " + bus.calculateAllowedSpeed());
   }
    }

