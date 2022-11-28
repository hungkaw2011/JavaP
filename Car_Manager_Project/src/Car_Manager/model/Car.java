/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car_Manager.model;


/**
 *
 * @author hungq
 */
public class Car extends Product{
    private int car_seats;
    private String car_color;
    private int car_tonnage;

    public Car() {
        super();
    }

    public Car(int car_seats, String car_color, int car_tonnage, String product_id, String product_name, int product_price) {
        super(product_id, product_name, product_price);
        this.car_seats = car_seats;
        this.car_color = car_color;
        this.car_tonnage = car_tonnage;
    }


    public int getCar_seats() {
        return car_seats;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_seats(int car_seats) {
        this.car_seats = car_seats;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" + "car_seats=" + car_seats + ", car_color=" + car_color + '}';
    }

    public int getCar_tonnage() {
        return car_tonnage;
    }

    public void setCar_tonnage(int car_tonnage) {
        this.car_tonnage = car_tonnage;
    }
    
}
