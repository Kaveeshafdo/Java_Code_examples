/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Oriented_Programming.Different_types_of_Classes_Abstract_keyword_and_Abstract_classes;

import java.util.stream.Stream;


public abstract class Product {
    private int id;
	private String name;
	private int minOrderQuantity;
	private boolean isDeliveryAvailable;
	
	public abstract boolean isAvailableInStock();
	
	public int getRemainingAmountInStock() {
		// here goes some code which checks amount of product in DB
		return 100; // just a stub for the sake of example;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinOrderQuantity() {
		return minOrderQuantity;
	}
	public void setMinOrderQuantity(int minOrderQuantity) {
		this.minOrderQuantity = minOrderQuantity;
	}
	public boolean isDeliveryAvailable() {
		return isDeliveryAvailable;
	}
	public void setDeliveryAvailable(boolean isDeliveryAvailable) {
		this.isDeliveryAvailable = isDeliveryAvailable;
	}

    Stream<Object> getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
