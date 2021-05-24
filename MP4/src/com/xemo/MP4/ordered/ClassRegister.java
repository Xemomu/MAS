package com.xemo.MP4.ordered;

import java.util.ArrayList;
import java.util.List;

public class ClassRegister {
    private String classId;
    private String year;
    public List<Student> students = new ArrayList<>();

    public ClassRegister(String classId, String year) {
        this.classId = classId;
        this.year = year;
    }

    public void addStudent(Student student) throws Exception {
        if (students.contains(student)) {
            throw new Exception("This student is already added to the class registry!");
        } else {
            students.add(student);
        }
    }

    public String showStudents() {
        String info = "";

        for (Student student : students) {
            info += student.getFirstName() + " " + student.getLastName() + "\n";
        }
        return info;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
