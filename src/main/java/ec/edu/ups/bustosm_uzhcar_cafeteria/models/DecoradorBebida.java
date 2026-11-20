/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

/**
 *
 * @author DELL
 */
public abstract class DecoradorBebida implements Bebida{
    
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        if(bebida == null){
            throw new IllegalArgumentException("La bebida es obligatoria");
        }
        this.bebida = bebida;
    }
    
    public Bebida getComponente(){
        return bebida;
    }
    
    public abstract String getNombreIngrediente();
    public abstract double getPrecioIngrediente();
    

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+", "+getNombreIngrediente();
    }

    @Override
    public Double getPrecio() {
        return bebida.getPrecio()+getPrecioIngrediente();
    }
    
    public static Bebida quitarDecorador(Bebida raiz, DecoradorBebida objetivo){
        if (raiz == objetivo){
            return objetivo.bebida;
        }
        Bebida actual = raiz;
        while(actual instanceof DecoradorBebida){
            DecoradorBebida decorador = (DecoradorBebida) actual;
            if(decorador.bebida == objetivo){
                decorador.bebida = objetivo.bebida;
                break;
            }
            actual = decorador.bebida;
        }
        return raiz;
    }
    
}
