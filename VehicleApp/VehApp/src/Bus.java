// Класс для представления автобуса
public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        // Расчет разрешенной скорости для автобуса
        return getMaxSpeed() * 0.6;
    }
}
