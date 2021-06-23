/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods.Exersices;

import java.util.Scanner;

public class FirstCharCapital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();

        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
