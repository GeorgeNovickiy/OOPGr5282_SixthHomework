public class calculateNetSalary {
    public int calcNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25); 
        return employee.getBaseSalary() - tax;
    }
}
