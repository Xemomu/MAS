package com.xemo.MP4;

import com.xemo.MP4.atribute_custom.Mob;
import com.xemo.MP4.bag.Player;
import com.xemo.MP4.bag.PlayerRaid;
import com.xemo.MP4.bag.Raid;
import com.xemo.MP4.ordered.ClassRegister;
import com.xemo.MP4.ordered.Student;
import com.xemo.MP4.subset.PlayerS;
import com.xemo.MP4.subset.RaidS;
import com.xemo.MP4.unique.Book;
import com.xemo.MP4.xor.DepartmentType;
import com.xemo.MP4.xor.Employee;
import com.xemo.MP4.xor.Finance;
import com.xemo.MP4.xor.It;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("----Attribute----");

//        Mob mob1 = new Mob("Orc", 200, 18, 2000);
////        mob1.setName("Orc");
////        mob1.setXpDrop(1000);
////        mob1.setHp(5000);
//
//        System.out.println("\n-----------------------\n");
//
//        System.out.println("----Unique----");
//
//        Book book1 = new Book("Spring for beginners", 9788328356061L, 600);
//        Book book2 = new Book("Spring for dummies", 1788328356061L, 70);
////        Book book3 = new Book("Spring for dfsammies", 9788328356061L, 70);
//
//        System.out.println("\n-----------------------\n");

        System.out.println("----Subset----");

        RaidS raid1 = new RaidS("Dungeon 1", "Expert", LocalDate.of(2021, 2, 1));
        RaidS raid2 = new RaidS("Dungeon 2", "Normal", LocalDate.of(2012, 12, 21));
        PlayerS player1 = new PlayerS("Xemo", 12, true);
        PlayerS player2 = new PlayerS("Kowal", 15, false);

        raid1.addPlayer(player1);
        raid1.setLeader(player1);
//        System.out.println(raid1);
//        raid1.removePlayer(player1);
//        System.out.println(raid1);
//        raid1.setLeader(player2);


        System.out.println("\n-----------------------\n");

//        System.out.println("----Ordered----");
//        Student student1 = new Student("Konrad", "Pilewski");
//        Student student2 = new Student("Janusz", "Symf");
//        Student student3 = new Student("Tomasz", "Kowalski");
//        Student student4 = new Student("Andrzej", "Sapak");
//
//        ClassRegister classRegister = new ClassRegister("1A", "2015");
//        classRegister.addStudent(student1);
//        classRegister.addStudent(student2);
//        classRegister.addStudent(student3);
//        classRegister.addStudent(student4);
//
//        System.out.println(classRegister.showStudents());
//
//        System.out.println("\n-----------------------\n");
//
//        System.out.println("----Bag----");
//        Player p1 = new Player(1, "Xemo");
//        Raid r1 = new Raid(1, "Dungeon 1");
//
//        PlayerRaid playerRaid1 = new PlayerRaid(p1, r1, LocalDate.of(2021, 2, 13), "Expert");
//        PlayerRaid playerRaid2 = new PlayerRaid(p1, r1, LocalDate.of(2022, 3, 23), "Peacfull");
//        PlayerRaid playerRaid3 = new PlayerRaid(p1, r1, LocalDate.of(2012, 1, 1), "Intermediate");
//
//        System.out.println(p1);
//
//
//        System.out.println("\n-----------------------\n");
//
//        System.out.println("----Xor----");
//        Employee employee = new Employee(1, "Konrad Pilewski");
//        Employee employee1 = new Employee(2, "Kdaswski");
//        Finance finance = new Finance(1, "Finance1");
//        It it = new It(1, "IT1");
//        employee.addToDepartment(finance);
////        employee.addToDepartment(it);
////        it.addEmployee(employee);
//        Employee employee2 = new Employee(3, "Ryszard Symf", DepartmentType.FINANCE, 3, "Finance3");
//        System.out.println(employee2);
//
//        System.out.println("\n-----------------------\n");
    }
}
