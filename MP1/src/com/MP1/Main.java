package com.MP1;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MAS_MP1
 * Konrad Pilewski s18530
 */

public class Main {

    public static void main(String[] args) {
//
//        Order order1 = new Order(1.15f, "adres1", LocalDateTime.now());
//        Order order2 = new Order(2.15f, "adres2", LocalDateTime.now());
//        Order order3 = new Order(3.15f, "adres3", LocalDateTime.now());
//        //testExtent();
//        Order.showExtent();
//        try {
//            throw new OutOfMemoryError("a");
//        } catch(RuntimeException e){
//            System.out.println("b");
//        } catch (Exception e) {
//            System.out.println("c");
//        } finally {
//            System.out.println("d");
//        }
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//        numbers.stream().filter(x-> x>4).collect(Collectors.toList());
//        System.out.println(numbers.size());
//        Thread thread = new Thread(() -> {
//            while(true){
//                System.out.println("a");
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
        test(null);
    }

    public static void testExtent(){
        try {
            var out = new ObjectOutputStream(new FileOutputStream("extents.bin"));
            Order.writeExtent(out);
            out.close();

            var in = new ObjectInputStream(new FileInputStream("extents.bin"));
            Order.readExtent(in);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void test(String... strings){
        if(strings == null){
            System.out.println("a");
        } else if (strings.length > 0) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
