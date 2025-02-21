package ProgramsPractice.ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
	
	public class Employee implements Comparable<Employee> {
	    private String name;
	    private int age;
	    private double salary;
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    @Override
	    public int compareTo(Employee other) {
	        return Double.compare(this.salary, other.salary);
	    }
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30, 50000.0));
        employees.add(new Employee("Jane Doe", 25, 60000.0));
        employees.add(new Employee("Bob Smith", 40, 40000.0));
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}
