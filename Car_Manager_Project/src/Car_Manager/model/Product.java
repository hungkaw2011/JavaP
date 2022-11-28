/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car_Manager.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hungq
 */
public class Product  implements Serializable{
    
    String product_id;
    String product_name;
    int product_price;

    public Product() {
        
    }
    
    public Product( String product_id, String product_name, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getProduct_price() {
        return product_price;
    }


    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.product_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.product_id, other.product_id);
    }

    @Override
    public String toString() {
        return "Product{ product_id=" + 
                product_id + ", product_name=" + product_name + ", product_price=" + product_price + '}';
    }
    
}
