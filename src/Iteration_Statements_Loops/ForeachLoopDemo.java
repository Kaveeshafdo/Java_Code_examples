/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteration_Statements_Loops;

public class ForeachLoopDemo {

    public static void main(String[] args) {
        System.out.println("=========== foreach loop");
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);

        for (int i : arr) {

        }
    }
}
