package com.xemo.MP4.xor;

import java.util.HashSet;
import java.util.Set;

public class Finance {
    private long id;
    private String name;
    private Set<Employee> employees = new HashSet<>();

    public Finance(long id, String name) {
        this.id = id;
        setName(name);
    }

    public void addEmployee(Employee employee) throws Exception {
        if (!this.employees.contains(employee)) {
            this.employees.add(employee);
            employee.addToDepartment(this);
        }
    }

    public void removeEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            this.employees.remove(employee);
            employee.removeEmployee();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can't be null!");
        }
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
