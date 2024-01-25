// Абстрактный класс транспортного средства
public abstract class Vehicle {
    private int maxSpeed;
    private String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

// Абстрактный метод для расчета разрешенной скорости
    public abstract double calculateAllowedSpeed();
    
}
