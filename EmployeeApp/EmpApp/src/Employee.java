import java.util.Date;

public class Employee {
    private String name;
    private Date dob;  
    private int baseSalary;

    // Конструктор для инициализации объекта Employee
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    // Метод получения информации о сотруднике
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}