/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class Queso extends DecoradorPlatos{

    public Queso(Platos plato) {
        super(plato);
    }

    @Override
    public String getNombreIngrediente() {
        return "Queso";
    }

    @Override
    public double getPrecioIngrediente() {
        return 1.00;
    }
    
}
