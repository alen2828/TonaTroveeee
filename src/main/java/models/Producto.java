package models;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String imagen;

    @ManyToMany(mappedBy = "productos")
    private List<Carrito> carritos;

    @ManyToMany(mappedBy = "productosDeseados")
    private List<Usuario> usuariosDeseando;

    public Producto() {
    }

    public Producto(Long id, String nombre, String descripcion, double precio, int stock, String imagen, List<Carrito> carritos, List<Usuario> usuariosDeseando) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.imagen = imagen;
        this.carritos = carritos;
        this.usuariosDeseando = usuariosDeseando;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    public List<Usuario> getUsuariosDeseando() {
        return usuariosDeseando;
    }

    public void setUsuariosDeseando(List<Usuario> usuariosDeseando) {
        this.usuariosDeseando = usuariosDeseando;
    }

    
}