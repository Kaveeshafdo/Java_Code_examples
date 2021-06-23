/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator {

    @Override
    public void processPayment(PaymentData payment) {
        /* String secureToken = ChaseApi.requestSecureTokenForApp();
		 * initPaymentPage(secureToken, payment.getPaymentAmount);
		 * ...
         */
    }

    @Override
    public boolean validatePayment(PaymentData payment) {
        // code to validate payment goes here
        return false;
    }
}
