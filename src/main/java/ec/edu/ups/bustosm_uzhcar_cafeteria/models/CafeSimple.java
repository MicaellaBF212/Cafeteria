/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class CafeSimple implements Bebida{

    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public Double getPrecio() {
        return 2.20;
    }

}
