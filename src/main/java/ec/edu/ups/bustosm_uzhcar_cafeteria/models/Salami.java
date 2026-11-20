/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public class Salami extends DecoradorPlatos{

    public Salami(Platos plato) {
        super(plato);
    }

    @Override
    public String getNombreIngrediente() {
        return "Salami";
    }

    @Override
    public double getPrecioIngrediente() {
        return 3.00;
    }
    
}
