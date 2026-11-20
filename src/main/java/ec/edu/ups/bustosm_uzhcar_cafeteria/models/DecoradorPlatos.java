/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public abstract class DecoradorPlatos implements Platos{
    
    protected Platos plato;

    public DecoradorPlatos(Platos plato) {
        if(plato == null){
            throw new IllegalArgumentException("El plato es obligatorio");
        }
        this.plato = plato;
    }

    public Platos getComponente(){
        return plato;
    }
    public abstract String getNombreIngrediente();
    public abstract double getPrecioIngrediente();
    

    @Override
    public String getDescripcion() {
        return plato.getDescripcion()+", "+getNombreIngrediente();
    }

    @Override
    public Double getPrecio() {
        return plato.getPrecio()+getPrecioIngrediente();
    }  
    
    public static Platos quitarDecorador(Platos raiz, DecoradorPlatos objetivo){
        if (raiz == objetivo){
            return objetivo.plato;
        }
        Platos actual = raiz;
        while(actual instanceof DecoradorPlatos){
            DecoradorPlatos decorador = (DecoradorPlatos) actual;
            if(decorador.plato == objetivo){
                decorador.plato = objetivo.plato;
                break;
            }
            actual = decorador.plato;
        }
        return raiz;
    }
}