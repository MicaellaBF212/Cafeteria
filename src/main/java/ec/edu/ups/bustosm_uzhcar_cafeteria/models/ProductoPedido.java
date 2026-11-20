/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.models;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ProductoPedido { // esta sera la factura con el plato base y sus adicionales
    
    private Bebida baseBebida;
    private Bebida bebida;
    private Platos basePlato;
    private Platos plato;
    private ArrayList<DecoradorBebida> decoradoresBebida = new ArrayList<>();
    private ArrayList<DecoradorPlatos> decoradoresPlatos = new ArrayList<>();
    
    public ProductoPedido(Bebida base) {
        this.baseBebida = base;
        this.bebida = base;
    }

    public ProductoPedido(Platos base) {
        this.basePlato = base;
        this.plato = base;
    }

    public boolean esBebida() {
        return baseBebida != null;
    }

    public String getNombreBase() {
        if (esBebida()) {
            return baseBebida.getDescripcion();
        }
        return basePlato.getDescripcion();
    }

    public double getPrecioBase() {
        if (esBebida()) {
            return baseBebida.getPrecio();
        }
        return basePlato.getPrecio();
    }
    
    public double getPrecio() {
        if (esBebida()) {
            return bebida.getPrecio();
        }
        return plato.getPrecio();
    }
    
    public boolean agregarAzucar() {
        if (!esBebida()) {
            return false;
        }
        guardarBebida(new Azucar(bebida));
        return true;
    }

    public boolean agregarCrema() {
        if (!esBebida()) {
            return false;
        }
        guardarBebida(new Crema(bebida));
        return true;
    }

    public boolean agregarTomate() {
        if (!esEnsalada()) {
            return false;
        }
        guardarPlato(new Tomate(plato));
        return true;
    }

    public boolean agregarVinagreta() {
        if (!esEnsalada()) {
            return false;
        }
        guardarPlato(new Vinagreta(plato));
        return true;
    }

    public boolean agregarPollo() {
        if (!esEnsalada()) {
            return false;
        }
        guardarPlato(new Pollo(plato));
        return true;
    }

    public boolean agregarQueso() {
        if (!esPizza()) {
            return false;
        }
        guardarPlato(new Queso(plato));
        return true;
    }

    public boolean agregarSalami() {
        if (!esPizza()) {
            return false;
        }
        guardarPlato(new Salami(plato));
        return true;
    }

    public boolean agregarPepperoni() {
        if (!esPizza()) {
            return false;
        }
        guardarPlato(new Pepperoni(plato));
        return true;
    }

    private boolean esEnsalada() {
        return basePlato instanceof EnsaladaSencilla;
    }

    private boolean esPizza() {
        return basePlato instanceof PizzaSencilla;
    }

    private void guardarBebida(DecoradorBebida decorador) {
        bebida = decorador;
        decoradoresBebida.add(decorador);
    }

    private void guardarPlato(DecoradorPlatos decorador) {
        plato = decorador;
        decoradoresPlatos.add(decorador);
    }
    
    public int cantidadAdicionales() {
        if (esBebida()) {
            return decoradoresBebida.size();
        }
        return decoradoresPlatos.size();
    }

    public String getNombreAdicional(int posicion) {
        if (esBebida()) {
            return decoradoresBebida.get(posicion).getNombreIngrediente();
        }
        return decoradoresPlatos.get(posicion).getNombreIngrediente();
    }

    public double getValorAdicional(int posicion) {
        if (esBebida()) {
            return decoradoresBebida.get(posicion).getPrecioIngrediente();
        }
        return decoradoresPlatos.get(posicion).getPrecioIngrediente();
    }

    public double getTotalAdicional(int posicion) {
        if (esBebida()) {
            return decoradoresBebida.get(posicion).getPrecio();
        }
        return decoradoresPlatos.get(posicion).getPrecio();
    }

    public void quitarAdicional(int posicion) {
        if (esBebida()) {
            DecoradorBebida decorador = decoradoresBebida.remove(posicion);
            bebida = DecoradorBebida.quitarDecorador(bebida, decorador);
        } else {
            DecoradorPlatos decorador = decoradoresPlatos.remove(posicion);
            plato = DecoradorPlatos.quitarDecorador(plato, decorador);
        }
    }
}