/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteration_Statements_Loops;

public class ForWithConditionLoopDemo {

    public static void main(String[] args) {

        System.out.println("=========== for loop");

        for (int i = 0; i < 5; i++) {
            System.out.println("counter: " + i);

        }

        // Infinite loop
//		for (;;) {
//
//		}
        System.out.println("=========== for loop | comma usage example");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("counters: i = " + i + ", j = " + j);
        }

    }

}
