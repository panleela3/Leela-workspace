package interview;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private LocalDate joiningDate;

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary,LocalDate joiningDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.joiningDate=joiningDate;
    }

    @Override
    public String toString() {
        return id + "-"+name;
    }
}
