/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Oriented_Programming.Different_types_of_Classes_Abstract_keyword_and_Abstract_classes;

import Object_Oriented_Programming.Different_types_of_Classes.Cart;
import Object_Oriented_Programming.Different_types_of_Classes.Cart.Discount;
import Object_Oriented_Programming.Different_types_of_Classes.Cart.Tax;

public class Demo {

    public static void main(String[] args) {
        User user = new User();

//		// === init static nested class
        Tax tax = new Cart.Tax("someTaxType", 0);
//		
//		// === init inner class
        Discount discount = new Cart().new Discount("firstClientDiscount", 0);

        // === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
        MasterProduct masterProduct = new MasterProduct();
        VariantProduct variantProduct = new VariantProduct();

        masterProduct.setName("Mercedes S-klass");
        variantProduct.setDeliveryAvailable(true);

        // === Anonymous class demo
        Product product = new Product() {
            @Override
            public boolean isAvailableInStock() {
                return false;
            }
        };

    }
}
