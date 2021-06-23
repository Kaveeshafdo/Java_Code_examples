/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Oriented_Programming.Different_types_of_Classes_Abstract_keyword_and_Abstract_classes;


public class VariantProduct extends Product{
    
	private MasterProduct[] variants;

	@Override
	public boolean isAvailableInStock() {
		for (MasterProduct masterProduct : variants) {
			if (masterProduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}
}
