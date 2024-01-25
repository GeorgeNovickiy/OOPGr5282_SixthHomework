import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Вася", new Date(), 50000);
        

        calculateNetSalary salaryCalculator = new calculateNetSalary();
        System.out.println("Чистая зарплата: " + salaryCalculator.calcNetSalary(employee));
    }
}