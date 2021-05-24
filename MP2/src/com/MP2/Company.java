package com.MP2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    String name;
    String country;
    private List<Engineer> engineers = new ArrayList<>();
    private static Set<Engineer> allEngineers = new HashSet<>();

    public Company(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void addEngineer(Engineer engineer) throws Exception {
        if (!engineers.contains(engineer)) {
            if (allEngineers.contains(engineer)) {
                throw new Exception("Enginer already works for another company");
            }
            engineers.add(engineer);
            allEngineers.add(engineer);
        }
    }

    public void deleteEngineer(Engineer engineer) {
        if (engineers.contains(engineer)) {

            this.engineers.remove(engineer);
        }
    }

    public void deleteAllEngineers() {


        this.engineers.clear();
    }

    public static void deleteCompany(Company company){
        company.deleteAllEngineers();
    }

    @Override
    public String toString() {
        var info = name + " company's engineers: \n";

        for (Engineer engineer : engineers) {
            info += " - " + engineer.name + "\n";
        }

        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Engineer> engineers) {
        this.engineers = engineers;
    }

    public static Set<Engineer> getAllEngineers() {
        return allEngineers;
    }

    public static void setAllEngineers(Set<Engineer> allEngineers) {
        Company.allEngineers = allEngineers;
    }
}
