/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car_Manager.model.controller.sort;

import Car_Manager.model.Product;
import java.util.Comparator;

/**
 *
 * @author hungq
 */
public class sortCarByPriceDESC implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return -(o1.getProduct_price()-o2.getProduct_price());
    }
}
