package com.MP2;

import java.util.ArrayList;
import java.util.List;

//asocjajcka zykła Engineer *-* Project
//kompozycja Engineer *-1
public class Engineer {
    public String name;
    private int yearsOfWork;
    private int age;
    private Company company;
    private List<Project> projects = new ArrayList<>();

    public Engineer(String name, int yearsOfWork, int age) {
        this.name = name;
        this.yearsOfWork = yearsOfWork;
        this.age = age;
    }

    public Engineer(Company company, String name, int yearsOfWork, int age) {
        this.company = company;
        this.name = name;
        this.yearsOfWork = yearsOfWork;
        this.age = age;
    }

    public void addProject(Project newProject) throws Exception {
        if (!projects.contains(newProject)) {
            projects.add(newProject);
            newProject.addEngineer(this);
        }
    }

    public void deleteProject(Project project) {
        if (projects.contains(project)) {
            projects.remove(project);
            project.deleteEngineer(this);
        }
    }

    public static Engineer createEngineer(Company company, String name, int yearsOfWork, int age) throws Exception {
        if (company == null) {
            throw new Exception("Company does not exist!");
        }
        Engineer engineer = new Engineer(company, name, yearsOfWork, age);
        company.addEngineer(engineer);
        return engineer;
    }

    public void engineersProjects() {
        var info = "Engineer " +
                "name='" + name + '\'' +
                ", yearsOfWork=" + yearsOfWork +
                ", age=" + age +
                "\nProjects of the engineer: \n";

        for (Project project : projects) {
            info += " - " + project.title + "\n";
        }

        System.out.println(info);
    }

    public String getEngineerCompanyInfo() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", yearsOfWork=" + yearsOfWork +
                ", age=" + age +
                ", company=" + company.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
