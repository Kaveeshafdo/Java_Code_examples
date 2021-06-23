/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.Scanner;

public class CodingExercise {

    public static void main(String[] args) {

        //  System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        
                //AddIntegers.main(new String[] {"5", "10"});
		//AreaOfTriangle.main(new String[] {});
		//CircleCircumference.main(new String[] {});
                
                
        AreaOfTriangle intr = new AreaOfTriangle();
        intr.areaOfTriangle();

        CircleCircumference ccf = new CircleCircumference();
        ccf.circleCircumference();
    }

}

class AreaOfTriangle {

    void areaOfTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will calculate area of triangle.");
        System.out.print("Please, enter A side of a triangle: ");
        double aSide = sc.nextDouble();

        System.out.print("Please, enter B side of a triangle: ");
        double bSide = sc.nextDouble();

        System.out.print("Please, enter C side of a triangle: ");
        double cSide = sc.nextDouble();

        double p = (aSide + bSide + cSide) / 2;
        double triangleArea = Math.sqrt(p * (p - aSide)
                * (p - bSide) * (p - cSide));

        System.out.println("Triangle area is: " + triangleArea);
    }

}

class CircleCircumference {

    void circleCircumference() {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will calculate circle circumference.");
        System.out.print("Please, enter circle radius: ");
        double radius = sc.nextDouble();

        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("Circle circumference is: " + circleCircumference);
    }
}
