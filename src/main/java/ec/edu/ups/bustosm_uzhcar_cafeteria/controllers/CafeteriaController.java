/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.bustosm_uzhcar_cafeteria.controllers;

import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Azucar;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Bebida;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.CafeSimple;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Crema;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.DecoradorBebida;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.DecoradorPlatos;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.EnsaladaSencilla;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Pepperoni;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.PizzaSencilla;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Platos;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Pollo;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.ProductoPedido;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Queso;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Salami;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Tomate;
import ec.edu.ups.bustosm_uzhcar_cafeteria.models.Vinagreta;
import ec.edu.ups.bustosm_uzhcar_cafeteria.views.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author DELL
 */
public class CafeteriaController {
    
    private PrincipalView vista;
    private ArrayList<ProductoPedido> pedidos;
    private ProductoPedido activo;
    private ArrayList<ProductoPedido> filaProducto;
    private ArrayList<Integer> filaAdicional;
    private boolean actualizando;
    
    public CafeteriaController(PrincipalView vista){
        this.vista = vista;
        this.pedidos = new ArrayList<>();
        this.filaProducto = new ArrayList<>();
        this.filaAdicional = new ArrayList<>();
        
        cargarTextos();
        configurarEventosProductos();
        configurarEventosAdicionales();
        configurarEventosTabla();
        configurarEventosEliminar();
        configurarEventosConfirmar();
        mostrarFactura();
    }
    
    private void cargarTextos(){
        Bebida cafe = new CafeSimple();
        vista.getLblCafe().setText(cafe.getDescripcion());
        vista.getLblCafePrecio().setText(dinero(cafe.getPrecio()));
        
        Platos ensalada = new EnsaladaSencilla();
        vista.getLblEnsalada().setText(ensalada.getDescripcion());
        vista.getLblEnsaladaPrecio().setText(dinero(ensalada.getPrecio()));
        
        Platos pizza = new PizzaSencilla();
        vista.getLblPizza().setText(pizza.getDescripcion());
        vista.getLblPizzaPrecio().setText(dinero(pizza.getPrecio()));
        
        DecoradorBebida azucar = new Azucar(cafe);
        vista.getLblAzucar().setText(azucar.getNombreIngrediente());
        vista.getLblAzucarPrecio().setText(dinero(azucar.getPrecioIngrediente()));
        
        DecoradorBebida crema = new Crema(cafe);
        vista.getLblCrema().setText(crema.getNombreIngrediente());
        vista.getLblCremaPrecio().setText(dinero(crema.getPrecioIngrediente()));
        
        DecoradorPlatos tomate = new Tomate(ensalada);
        vista.getLblTomate().setText(tomate.getNombreIngrediente());
        vista.getLblTomatePrecio().setText(dinero(tomate.getPrecioIngrediente()));
        
        DecoradorPlatos vinagreta = new Vinagreta(ensalada);
        vista.getLblVinagreta().setText(vinagreta.getNombreIngrediente());
        vista.getLblVinagretaPrecio().setText(dinero(vinagreta.getPrecioIngrediente()));
        
        DecoradorPlatos pollo = new Pollo(ensalada);
        vista.getLblPollo().setText(pollo.getNombreIngrediente());
        vista.getLblPolloPrecio().setText(dinero(pollo.getPrecioIngrediente()));
        
        DecoradorPlatos queso = new Queso(pizza);
        vista.getLblQueso().setText(queso.getNombreIngrediente());
        vista.getLblQuesoPrecio().setText(dinero(queso.getPrecioIngrediente()));
        
        DecoradorPlatos salami = new Salami(pizza);
        vista.getLblSalami().setText(salami.getNombreIngrediente());
        vista.getLblSalamiPrecio().setText(dinero(salami.getPrecioIngrediente()));
        
        DecoradorPlatos pepperoni = new Pepperoni(pizza);
        vista.getLblPepperoni().setText(pepperoni.getNombreIngrediente());
        vista.getLblPepperoniPrecio().setText(dinero(pepperoni.getPrecioIngrediente()));
    }
    
    public void agregarCafe(){
        agregarProducto(new ProductoPedido(new CafeSimple()));
    }
    
    public void agregarEnsalada() {
        agregarProducto(new ProductoPedido(new EnsaladaSencilla()));
    }

    public void agregarPizza() {
        agregarProducto(new ProductoPedido(new PizzaSencilla()));
    }

    private void agregarProducto(ProductoPedido producto) {
        pedidos.add(producto);
        activo = producto;
        mostrarFactura();
    }
    
    public void configurarEventosProductos() {
        vista.getBtnCafe().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCafe();
            }
        });
        vista.getBtnEnsalada().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEnsalada();
            }
        });
        vista.getBtnPizza().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPizza();
            }
        });
    }
    
    public void agregarAzucar() {
        if (activo != null && activo.agregarAzucar()) {
            mostrarFactura();
        }
    }

    public void agregarCrema() {
        if (activo != null && activo.agregarCrema()) {
            mostrarFactura();
        }
    }

    public void agregarTomate() {
        if (activo != null && activo.agregarTomate()) {
            mostrarFactura();
        }
    }

    public void agregarVinagreta() {
        if (activo != null && activo.agregarVinagreta()) {
            mostrarFactura();
        }
    }

    public void agregarPollo() {
        if (activo != null && activo.agregarPollo()) {
            mostrarFactura();
        }
    }

    public void agregarQueso() {
        if (activo != null && activo.agregarQueso()) {
            mostrarFactura();
        }
    }

    public void agregarSalami() {
        if (activo != null && activo.agregarSalami()) {
            mostrarFactura();
        }
    }

    public void agregarPepperoni() {
        if (activo != null && activo.agregarPepperoni()) {
            mostrarFactura();
        }
    }
    
    public void configurarEventosAdicionales() {
        vista.getBtnAzucar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAzucar();
            }
        });
        vista.getBtnCrema().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCrema();
            }
        });
        vista.getBtnTomate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTomate();
            }
        });
        vista.getBtnVinagreta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarVinagreta();
            }
        });
        vista.getBtnPollo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPollo();
            }
        });
        vista.getBtnQueso().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarQueso();
            }
        });
        vista.getBtnSalami().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarSalami();
            }
        });
        vista.getBtnPepperoni().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPepperoni();
            }
        });
    }
    
    public void seleccionarProducto() {
        if (actualizando) {
            return;
        }
        int fila = vista.getFilaSeleccionada();
        if (fila >= 0) {
            activo = filaProducto.get(fila);
        }
    }

    public void configurarEventosTabla() {
        vista.getTlbFactura().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    seleccionarProducto();
                }
            }
        });
    }
    
    public void mostrarFactura() {
        actualizando = true;
        vista.limpiarFactura();
        filaProducto.clear();
        filaAdicional.clear();

        double subtotal = 0;
        int filaActiva = -1;

        for (ProductoPedido p : pedidos) {
            if (p == activo) {
                filaActiva = filaProducto.size();
            }
            
            vista.agregarFila(p.getNombreBase(), "", dinero(p.getPrecioBase()), dinero(p.getPrecioBase()));
            filaProducto.add(p);
            filaAdicional.add(-1);

            for (int i = 0; i < p.cantidadAdicionales(); i++) {
                vista.agregarFila("", p.getNombreAdicional(i), dinero(p.getValorAdicional(i)), dinero(p.getTotalAdicional(i)));
                filaProducto.add(p);
                filaAdicional.add(i);
            }
            subtotal = subtotal + p.getPrecio();
        }
        vista.setSubtotal(dinero(subtotal));
        if (filaActiva >= 0) {
            vista.seleccionarFila(filaActiva);
        }
        actualizando = false;
    }
    
    public void eliminar() {
        int fila = vista.getFilaSeleccionada();
        if (fila < 0) {
            return;
        }
        ProductoPedido producto = filaProducto.get(fila);
        int adicional = filaAdicional.get(fila);

        // Un plato base solo se elimina si ya no tiene adicionales
        if (adicional == -1 && producto.cantidadAdicionales() > 0) {
            return;
        }
        if (!vista.confirmar("¿Desea eliminar la fila seleccionada?")) {
            return;
        }

        if (adicional == -1) {
            pedidos.remove(producto);
            activo = null;
        } else {
            producto.quitarAdicional(adicional);
            activo = producto;
        }
        mostrarFactura();
    }
    
    public void configurarEventosEliminar() {
        vista.getBtnEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });
    }
    
    public void confirmarPedido() {
        if (pedidos.isEmpty()) {
            return;
        }
        if (vista.confirmar("¿Desea confirmar el pedido?")) {
            pedidos.clear();
            activo = null;
            mostrarFactura();
        }
    }
    
    public void configurarEventosConfirmar() {
        vista.getBtnConfirmar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmarPedido();
            }
        });
    }
    
    private String dinero(double valor) {
        return String.format(java.util.Locale.US, "$%.2f", valor);
    }
}
