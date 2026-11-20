/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class PizzaSencilla implements Platos{

    @Override
    public String getDescripcion() {
        return "Pizza sencilla";
    }

    @Override
    public Double getPrecio() {
        return 5.00;
    }
    
}
