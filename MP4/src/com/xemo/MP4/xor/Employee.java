package com.xemo.MP4.xor;

public class Employee {
    private long id;
    private String name;
    private Finance finance;
    private It it;

    public Employee(long id, String name) {
        this.id = id;
        setName(name);
    }

    public Employee(long id, String name, DepartmentType departmentType, long departmentId, String departmentName) throws Exception {
        this.id = id;
        setName(name);
        if (departmentType == DepartmentType.FINANCE) {
            this.finance = new Finance(departmentId, departmentName);
            this.finance.addEmployee(this);
        } else if (departmentType == DepartmentType.IT) {
            this.it = new It(departmentId, departmentName);
            this.it.addEmployee(this);
        }
    }

    public void addToDepartment(Finance finance) throws Exception {
        if (finance == null) {
            throw new IllegalArgumentException("Department can't be null");
        }
        if (this.it != null) {
            throw new Exception("Employee is already in IT department");
        }
        if (this.finance == finance) {
            return;
        }
        this.finance = finance;
        finance.addEmployee(this);
    }

    public void addToDepartment(It it) throws Exception {
        if (it == null) {
            throw new IllegalArgumentException("Department can't be null");
        }
        if (this.finance != null) {
            throw new Exception("Employee is already in Finance department");
        }
        if (this.it == it) {
            return;
        }
        this.it = it;
        it.addEmployee(this);
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
            throw new IllegalArgumentException("Name can't be null");
        }
        this.name = name;
    }

    public Finance getFinance() {
        if (this.finance == null) {
            throw new IllegalArgumentException("Not an employee of FINANCE department");
        }
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }

    public It getIt() {
        if (this.it == null) {
            throw new IllegalArgumentException("Not an employee of IT department");
        }
        return it;
    }

    public void setIt(It it) {
        this.it = it;
    }

    public void removeEmployee() {
        if (this.finance != null) {
            this.finance.removeEmployee(this);
            this.finance = null;
        } else if (this.it != null) {
            this.it.removeEmployee(this);
            this.it = null;
        }
    }

    public String toString() {
        return getId() + " " + getName() + "\n" + (this.finance != null ? "Finance: " + getFinance() : "none")
                + "\n" + (this.it != null ? "IT: " + getIt() : "none");
    }
}
