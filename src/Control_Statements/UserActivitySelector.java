/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;

import java.util.Scanner;

public class UserActivitySelector {

    public static void main(String[] args) {
        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch (userInput) {
            case "login":
                System.out.println("Please, enter your username");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye!");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with "
                        + "support of \u00AEIT-Bulls.com");
                break;
            default:
                System.out.println("Please, enter one of these values: login, "
                        + "sign_up, terminate_program, main_menu, about_app");
                break;
        }

    }
}
