package model;

public class Employee extends Person implements CalculateTheAmount {
    private double bonus;
    private double fine;

    public Employee() {
    }

    public Employee(double bonus, double fine) {
        this.bonus = bonus;
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                '}';
    }

    @Override
    public String id() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public String phoneNumber() {
        return null;
    }

    @Override
    public double totalmoney() {
        return 0;
    }
}
