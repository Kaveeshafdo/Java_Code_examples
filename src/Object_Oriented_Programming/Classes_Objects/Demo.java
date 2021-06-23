/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Oriented_Programming.Classes_Objects;

import java.math.BigDecimal;

/**
 *
 * @author Acer
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("========== DEFAULT CONSTRUCTOR DEMO ==========");

        Cart cart = new Cart();
        System.out.println(cart);

        System.out.println();
        System.out.println("========== CUSTOM CONSTRUCTOR DEMO ==========");

        Cart cart2 = new Cart(2, 2);
        System.out.println(cart2);

        System.out.println();
        System.out.println("========== ADD PRODUCTS TO CART ==========");

        cart.addProduct(new Product("L shaped Showerbath", BigDecimal.valueOf(300)));
        cart.addProduct(new Product("P Shaped Right Hand Bath", BigDecimal.valueOf(200)));

        System.out.println(cart);

    }
}
