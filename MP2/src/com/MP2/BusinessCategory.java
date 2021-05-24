package com.MP2;

import java.util.ArrayList;
import java.util.List;

//asocjacja z atrybutem BusinessCategory *-1 ProjectBu. 1-* Project
public class BusinessCategory {
    private String name;
    private Engineer engineer;
    private List<ProjectBusinessCategory> projectBusinessCategories = new ArrayList<>();

    public BusinessCategory(String name, Engineer engineer) {
        this.name = name;
        this.engineer = engineer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public void addProjectBusinessCategory(ProjectBusinessCategory projectBusinessCategory) throws Exception {
        if (!projectBusinessCategories.contains(projectBusinessCategory)) {
            projectBusinessCategories.add(projectBusinessCategory);
//            projectBusinessCategory.setBusinessCategory(this);
        }
    }

    public void deleteProjectBusinesscategory(ProjectBusinessCategory projectBusinessCategory) {
        if (projectBusinessCategories.contains(projectBusinessCategory)) {
            projectBusinessCategories.remove(projectBusinessCategory);
            projectBusinessCategory.businessCategory = null;
        }
    }

    @Override
    public String toString() {
        return "BusinessCategory{ " +
                "name='" + name + '\'' +
                ", engineer=" + engineer.getName() +
                '}';
    }
}
