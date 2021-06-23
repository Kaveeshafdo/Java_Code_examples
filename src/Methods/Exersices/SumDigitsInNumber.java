/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods.Exersices;

import java.util.Scanner;

public class SumDigitsInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return Math.abs(result);
    }

}
