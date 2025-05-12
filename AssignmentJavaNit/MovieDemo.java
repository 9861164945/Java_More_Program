package com.AssignmentJavaNit;
import java.util.Scanner;

public class MovieDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Title of the movie:");
        String title = sc.nextLine();

        System.out.println("Enter Release Year of the movie:");
        int year = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Genre of the movie:");
        String genre = sc.nextLine();

       
        Movie m1;
       
        if (title.isEmpty() || year == 0 || genre.isEmpty()) {
            m1 = new Movie("KGF", 2022, "Thriller");
        } else {
            m1 = new Movie(title, year, genre);
        }

       
        System.out.println(m1);
        
        sc.close(); 
    }
}
