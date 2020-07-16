/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Jul-20
 *  Time: 10:47 AM
 */

import java.util.Scanner;

public class ScannerQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll, name and section separate them by space");
        int roll = sc.nextInt();
        String name = sc.next();
        String section = sc.next();
        System.out.println(roll + "," + name + "," + section);
    }
}
