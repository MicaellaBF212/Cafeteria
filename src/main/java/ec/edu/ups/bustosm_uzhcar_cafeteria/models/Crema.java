/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class Crema extends DecoradorBebida{

    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getNombreIngrediente() {
        return "Crema";
    }

    @Override
    public double getPrecioIngrediente() {
        return 1.20;
    }
    
}
