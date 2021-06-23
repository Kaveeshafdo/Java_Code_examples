/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

public class NewRefactoringDemo2 {

    public static void main(String[] args) {

        printToConsole();

    }

    private static void printToConsole() {
        int i = 10;
        System.out.println("Some code that are not aligned");
        int sum = 10 + 5;
        System.out.println(sum);
        System.out.println(sum);
    
    }
}
