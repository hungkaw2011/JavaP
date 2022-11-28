/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Car_Manager.model.controller;

import Car_Manager.model.Car;
import Car_Manager.model.Product;
import java.util.List;

/**
 *
 * @author hungq
 */
public interface DataController {
    String Car_File="CAR.BIN";
    <T> void writeToFile(List<T> data, String filename);
    <T> List<T> readDataFromFile(String filename);
    void sortByPriceASC(List<Car> cars);
    void sortByPriceDESC(List<Car> cars);
    List<Car> searchProductByName(List<Car> cars,String key);
    List<Car> searchProductByPrice(List<Car> cars,float key);
    List<Car> searchProductByColor(List<Car> cars,String key);

}
