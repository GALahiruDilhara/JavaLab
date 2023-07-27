public class Employee {

    private int Age;
    private String Name;
    private double Salary;
    private double Bonus;

    

    public Employee(int age, String name, double salary, double bonus) {
        Age = age;
        Name = name;
        Salary = salary;
        Bonus = bonus;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    public double getBonus() {
        return Bonus;
    }
    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double BonusAmount(){
        return this.Bonus+this.Salary;
    }
    
}
