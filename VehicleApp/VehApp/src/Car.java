// Класс для представления автомобиля
public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        // Расчет разрешенной скорости для автомобиля
        return getMaxSpeed() * 0.8;
    }
}