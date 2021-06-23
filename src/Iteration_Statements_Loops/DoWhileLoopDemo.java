/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteration_Statements_Loops;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        System.out.println("=========== do-while loop");
        int counter = 0;
        do {
            System.out.println("counter: " + counter++);
        } while (counter < 5);

        do {
            System.out.println("counter is five already: " + counter);
        } while (counter < 5);

    }
}
