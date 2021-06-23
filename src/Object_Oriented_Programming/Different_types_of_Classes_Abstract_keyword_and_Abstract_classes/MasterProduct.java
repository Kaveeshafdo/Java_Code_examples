/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Oriented_Programming.Different_types_of_Classes_Abstract_keyword_and_Abstract_classes;


public class MasterProduct extends Product {
    private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}
}
