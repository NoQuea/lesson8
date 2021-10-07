package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalService();

        while (true){
            String next = scanner.next();
            if ("exit".equals(next)){
                break;
            }else if ("get".equals(next)){
                try {
                    System.out.println(service.get());
                } catch (NoSuchElementsException e){
                    System.out.println("no elements");
                    break;
                }
            } else {
                try {
                    service.add(next);
                } catch (LowMemoryException e){
                    System.out.println("memory is full");
                    break;
                }
            }
        }
    }
}
