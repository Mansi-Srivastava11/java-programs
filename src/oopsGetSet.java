import java.lang.String;
class Employee {
    int Salary;
    String name;

    public void setName(String n) {
        name = n;
    }
    public void setSalary(int i) {
        Salary = i;
    }

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }
}
public class oopsGetSet {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(4000000);
        emp.setName("Mansi Srivastava");
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }

}
