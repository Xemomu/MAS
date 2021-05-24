package com.MP2;


public class ProjectBusinessCategory {
    public Project project;
    public BusinessCategory businessCategory;
    public String priority;

    public ProjectBusinessCategory(Project project, BusinessCategory businessCategory, String priority) throws Exception {
        this.project = project;
        this.businessCategory = businessCategory;
        this.priority = priority;
        this.project.addProjectBusinessCategory(this);
        this.businessCategory.addProjectBusinessCategory(this);
    }

    public void delete() throws Exception {
        this.businessCategory.deleteProjectBusinesscategory(this);
        this.project.deleteProjectBusinesscategory(this);
    }

    public void setBusinessCategory(BusinessCategory businessCategory) throws Exception {
        if (this.businessCategory != null) {
            businessCategory.deleteProjectBusinesscategory(this);
            this.businessCategory = null;
        }
        this.businessCategory = businessCategory;
        this.businessCategory.addProjectBusinessCategory(this);
    }

    public void setProject(Project project) throws Exception {
        if (this.project != null) {
            project.deleteProjectBusinesscategory(this);
            this.project = null;
        }
        this.project = project;
        this.project.addProjectBusinessCategory(this);
    }

    @Override
    public String toString() {
        return "ProjectBusinessCategory{" +
                "project=" + project.getTitle() +
                ", businessCategory=" + businessCategory.getName() +
                ", priority='" + priority + '\'' +
                '}';
    }

    public Project getProject() {
        return project;
    }

    public BusinessCategory getBusinessCategory() {
        return businessCategory;
    }


    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
