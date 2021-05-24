package com.MP2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        testNormalAssociation();
//        testAssociationWithAtribute();
//        testAssociationWithQualifier();
//        testComposition();

    }

    public static void testNormalAssociation() throws Exception {
        // *-*
        System.out.println("<<<<<----Asocjacja zwykła---->>>>\n");

        Engineer engineer1 = new Engineer("Konrad", 4, 25);
        Engineer engineer2 = new Engineer("Janusz", 15, 40);

        Project project1 = new Project(1, "business expense calculator", 100000.0);
        Project project2 = new Project(2, "System for hospitals", 2000000.0);

        engineer1.addProject(project1);
        project2.addEngineer(engineer1);
        engineer2.addProject(project1);
        engineer2.addProject(project2);

        project1.deleteEngineer(engineer2);

        project1.engineersInProject();
        engineer1.engineersProjects();
        project2.engineersInProject();
        System.out.println("----------------");
    }

    public static void testAssociationWithAtribute() throws Exception {
        System.out.println("<<<<<----Asocjacja z atrybutem---->>>>\n");
        Engineer engineer1 = new Engineer("Janusz", 20, 50);
        Engineer engineer2 = new Engineer("Piotr", 10, 30);
        Engineer engineer3 = new Engineer("Jakub", 3, 22);

        Project project1 = new Project(1, "Media Player", 50000.0);
        Project project2 = new Project(2, "Goal tracker", 10000.0);
        Project project3 = new Project(3, "Online shop", 1000000.0);

        BusinessCategory businessCategory1 = new BusinessCategory("Finance", engineer1);
        BusinessCategory businessCategory2 = new BusinessCategory("E-commerce", engineer2);
        BusinessCategory businessCategory3 = new BusinessCategory("Entertainment", engineer3);

        ProjectBusinessCategory projectBusinessCategory1 = new ProjectBusinessCategory(project1, businessCategory1, "Critical");
        ProjectBusinessCategory projectBusinessCategory2 = new ProjectBusinessCategory(project2, businessCategory2, "Important");
        ProjectBusinessCategory projectBusinessCategory3 = new ProjectBusinessCategory(project3, businessCategory3, "Normal");

        projectBusinessCategory3.delete();
        System.out.println(projectBusinessCategory1);
        System.out.println(projectBusinessCategory2);
        System.out.println("----------------");
    }

    public static void testAssociationWithQualifier() throws Exception {
        System.out.println("<<<<<----Asocjacja kwalifikowana---->>>>\n");

        Project project1 = new Project(1, "Media Player", 50000.0);
        Client client1 = new Client("Konrad", "kp@gmial.com", LocalDate.of(1999, 6, 30), project1);
        project1.addClient(client1);

        System.out.println(project1.findClient(client1.getEmail()));
        System.out.println("----------------");
    }

    public static void testComposition() throws Exception {
        System.out.println("<<<<<----Kompozycja---->>>>\n");

        Company company1 = new Company("Apple", "USA");
        Company company2 = new Company("Allegro", "Poland");

        Engineer engineer1 = Engineer.createEngineer(company1,"Konrad", 4, 25);
        Engineer engineer2 = Engineer.createEngineer(company1,"Janusz", 15, 40);

//        Company.deleteCompany(company1);
        System.out.println(company1);
        System.out.println(company2);
        engineer1.getEngineerCompanyInfo();
        engineer2.getEngineerCompanyInfo();

        System.out.println("----------------");
    }
}
