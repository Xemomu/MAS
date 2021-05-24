package com.MP2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//asocjacja zwykła Engineer 1-* Project
//asocjacja z atrybutem BusinessCategory *-1 ProjectBu. 1-* Project
//asocjacja kwalifikowana Project 1-* Client
public class Project {
    private int id;
    public String title;
    private double fundsAmount;
    public List<Engineer> engineers = new ArrayList<>();
    private List<ProjectBusinessCategory> projectBusinessCategories = new ArrayList<>();
    private Map<String, Client> clientMap = new TreeMap<>();

    public Project(int id, String title, double fundsAmount) {
        this.id = id;
        this.title = title;
        this.fundsAmount = fundsAmount;
    }

    public void addEngineer(Engineer newEngineer) throws Exception {
        if (!engineers.contains(newEngineer)) {
            engineers.add(newEngineer);
            newEngineer.addProject(this);
        }
    }

    public void deleteEngineer(Engineer engineer) {
        if (engineers.contains(engineer)) {
            engineers.remove(engineer);
            engineer.deleteProject(this);
        }
    }

    public void addClient(Client client) throws Exception {
        if (!clientMap.containsKey(client.getEmail())) {
            clientMap.put(client.getEmail(), client);
            client.setProject(this);
        }
    }

    public void deleteClient(String email) throws Exception {
        if (!clientMap.containsKey(email)) {
            throw new Exception("Can't find client with email: " + email);
        }
        clientMap.remove(email);
    }

    public Client findClient(String email) throws Exception {
        if (!clientMap.containsKey(email)) {
            throw new Exception("Can't find client with email: " + email);
        }
        return clientMap.get(email);
    }

    public void engineersInProject() {
        var info = "Project " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", fundsAmount=" + fundsAmount +
                ", engineers=" + engineers +
                ", projectBusinessCategories=" + projectBusinessCategories +
                "\nEngineers in the project: \n";

        for (Engineer engineer : engineers) {
            info += " - " + engineer.name + "\n";
        }

        System.out.println(info);
    }

    public void addProjectBusinessCategory(ProjectBusinessCategory projectBusinessCategory) throws Exception {
        if (!projectBusinessCategories.contains(projectBusinessCategory)) {
            projectBusinessCategories.add(projectBusinessCategory);
//            projectBusinessCategory.setProject(this);
        }
    }

    public void deleteProjectBusinesscategory(ProjectBusinessCategory projectBusinessCategory) {
        if (projectBusinessCategories.contains(projectBusinessCategory)) {
            projectBusinessCategories.remove(projectBusinessCategory);
            projectBusinessCategory.project = null;
        }
    }

    public void showPBC(){
        String info = "\"Project \" +\n" +
                "\"id=\" + id +\n" +
                "\", title='\" + title + '\\'' +\n" +
                "\", fundsAmount=\" + fundsAmount +\n" +
                "\", projectBusinessCategories=\"" + projectBusinessCategories ;
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFundsAmount() {
        return fundsAmount;
    }

    public void setFundsAmount(double fundsAmount) {
        this.fundsAmount = fundsAmount;
    }

}
