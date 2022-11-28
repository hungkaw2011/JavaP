/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car_Manager.model.controller;

import Car_Manager.model.Car;
import Car_Manager.model.Product;
import Car_Manager.model.controller.sort.sortCarByPriceASC;
import Car_Manager.model.controller.sort.sortCarByPriceDESC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hungq
 */
public class DataControllerImp implements DataController{

    @Override
    public <T> void writeToFile(List<T> data, String fileName) {
        try ( FileOutputStream fos = new FileOutputStream(fileName);  
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> data = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try ( FileInputStream fis = new FileInputStream(file);  
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                data = (List<T>) ois.readObject();
            } catch (FileNotFoundException ex) {
            } catch (IOException | ClassNotFoundException ex) {
            }
        }
        return data;
    }

    @Override
    public void sortByPriceASC(List<Car> cars) {
        Collections.sort(cars,new sortCarByPriceASC());
    }

    @Override
    public void sortByPriceDESC(List<Car> cars) {
        Collections.sort(cars,new sortCarByPriceDESC());
    }

    @Override
    public List<Car> searchProductByName(List<Car> cars, String key) {
        List<Car> resultList=new ArrayList<>();
        for (Car product : cars) {
            if (product.getProduct_name().toLowerCase().contains(key.toLowerCase())){
                resultList.add(product);
            }
        }
        return resultList;
    }

    @Override
    public List<Car> searchProductByPrice(List<Car> cars, float key) {
        List<Car> resultList=new ArrayList<>();
        for (Car product : cars) {
            if (product.getProduct_price()==key){
                resultList.add(product);
            }
        }
        return resultList;
    }

    @Override
    public List<Car> searchProductByColor(List<Car> cars, String key) {
        List<Car> resultList=new ArrayList<>();
        for (Car product : cars) {
            if (product.getCar_color().toLowerCase().contains(key.toLowerCase())){
                resultList.add(product);
            }
        }
        return resultList;       
    }
}
