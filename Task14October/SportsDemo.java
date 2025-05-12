package com.Task14October;

import java.util.Scanner;

public class SportsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Sports s1 = new Sports();
        
        System.out.println("Enter Sport Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Team Size:");
        int size = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Sport Type:");
        String type = sc.nextLine();
        
        Sports s2 = new Sports(name, size, type);
        
        s2.displayInfo();
        
        sc.close();
    }
}
