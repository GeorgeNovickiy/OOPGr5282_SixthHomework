// Класс, представляющий бензиновый двигатель, реализующий интерфейс Engine
public class PetrolEngine implements Engine {
    // Реализация метода для запуска бензинового двигателя
    @Override
    public void start() {
        // Логика запуска бензинового двигателя
        System.out.println("Бензиновый двигатель запущен.");
    }
}