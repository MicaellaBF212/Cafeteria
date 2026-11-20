/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class Tomate extends DecoradorPlatos{

    public Tomate(Platos plato) {
        super(plato);
    }

    @Override
    public String getNombreIngrediente() {
        return "Tomate";
    }

    @Override
    public double getPrecioIngrediente() {
        return 1.10;
    }
    
}
