/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public class Client {

    private PaymentProcessor paymentProcessor;

    {
        paymentProcessor = new PayPalPaymentProcessor();
    }

    public void checkout(PaymentData payment) {
        // ... some methods calls goes here
        paymentProcessor.processPayment(payment);
        PaymentProcessor.someStaticMethod(); // demo of static method invocation
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

}
