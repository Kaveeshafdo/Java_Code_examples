/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Acer
 */
public class PayPalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentData payment) {
        /* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
		 * fillPaymentForm(paymentForm, payment);
		 * paymentForm.submit();
		 * ...
         */
    }
}
