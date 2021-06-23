/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public interface PaymentProcessor {

    int RETRY_ATTEPMPTS = 5;

    void processPayment(PaymentData payment);

    default void someDefaultMethod() {
        System.out.println("This is the default method");
    }

    static void someStaticMethod() {
        System.out.println("This is the static method");
    }
}
