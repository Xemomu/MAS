package com.MP2;

import java.time.LocalDate;

//Asocjacja kwalifikowana Client *-1 Project
public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Project project;

    public Client(String name, String email, LocalDate birthDate, Project project) throws Exception {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.project = project;
        this.project.addClient(this);
    }

    public void setProject(Project project) throws Exception {
        if (this.project != project) {
            this.project.deleteClient(email);
            this.project = project;
            this.project.addClient(this);
        }
    }

    @Override
    public String toString() {
        return "Client{ " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", project=" + project.getTitle() +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Project getProject() {
        return project;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client that = (Client) o;
        return email.equals(that.email);
    }
}
