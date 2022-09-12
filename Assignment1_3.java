/*
 * Write a Java program to perform the following operations:

 a) Read a line of text
 b) Search for a sub-string SDMCET (case insensitive search)
 c) If found, then print success message
 d) Otherwise throw an exception SubStringNotFoundException with appropriate message

 */

import java.util.Scanner;

public class Assignment1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the line of text");
        String string=sc.nextLine();
        sc.close();
        string=string.toLowerCase();
        try {
            if (string.contains("sdmcet")) {
                System.out.println("The pattern found");
            } else {
                throw new Exception("java.lang.SubStringNotFoundException: pattern not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
