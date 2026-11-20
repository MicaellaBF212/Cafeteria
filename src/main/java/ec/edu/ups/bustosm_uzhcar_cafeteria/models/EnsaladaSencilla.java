/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class EnsaladaSencilla implements Platos{

    @Override
    public String getDescripcion() {
        return "Ensalada sencilla";
    }

    @Override
    public Double getPrecio() {
        return 3.00;
    }
    
}
