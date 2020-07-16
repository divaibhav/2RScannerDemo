/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 14-Jul-20
 *  Time: 5:11 PM
 */
/*
Application to demonstrate use of Scanner Class
Create an Application to accept name, age,
4-digit code, cpi, mobile no, passed and display these values
to user in the given format
Name : Vaibhav Diwan
Age : 36
4-digit Code : 1122
cpi : 6.6
Mobile No : 9754435581
Passed : false
 */

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your full Name");
        //declaring a String object to store name of user
        String name = object.nextLine();
        System.out.println("Enter your age");
        //byte can store values ranging from
        //-128 to 0 to 127
        byte age = object.nextByte();
        System.out.println("Enter 4-digit secret code");
        short code = object.nextShort();
        System.out.println("Enter your CPI");
        double cpi = object.nextDouble();
        System.out.println("enter your mobile number");
        long mobileNumber = object.nextLong();
        System.out.println("Enter your exam status as true for pass or false for fail");
        boolean passed = object.nextBoolean();
        //to close scanner call close method
        object.close();

        //output
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("4-digit code : " + code);
        System.out.println("CPI : " + cpi);
        System.out.println("Mobile no : " + mobileNumber);
        System.out.println("Passed : " + passed);
    }
}
