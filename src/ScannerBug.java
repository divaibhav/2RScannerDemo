/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Jul-20
 *  Time: 10:16 AM
 */
// to demonstrate problem of reading String after numeric value

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll number");
        int roll = sc.nextInt();
        //sc.nextLine();
        System.out.println("enter your full name");
        String name = sc.nextLine();
        System.out.println("enter section");
        String section = sc.nextLine();
        System.out.println("output starts");
        System.out.println(roll + "\n" + name + "\n" + section);
        sc.close();
    }
}
