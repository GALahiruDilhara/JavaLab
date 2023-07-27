public class test {

    public static void main(String []args){
        Employee employee = new Employee(28, "Bogdan", 50000, 10000);
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Employee Basic Salary: "+employee.getSalary());
        System.out.println("Employee bonus: "+employee.getBonus());
        System.out.println("Employee Bonus Amount: "+employee.BonusAmount());
    }
    
}
