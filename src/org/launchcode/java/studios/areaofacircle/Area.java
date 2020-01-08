package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me the radius of your circle:");
        r = input.nextDouble();
        input.close();
        area = Circle.getArea(r);
        System.out.println("The area of a circle with a radius of " + r + " is: " + area);
    }
}