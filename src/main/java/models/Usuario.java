package models;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contrasena;

    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;

    @OneToMany(mappedBy = "usuario")
    private List<Direccion> direcciones;

    @OneToOne(mappedBy = "usuario")
    private Carrito carrito;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, String contrasena, List<Orden> ordenes, List<Direccion> direcciones, Carrito carrito) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.ordenes = ordenes;
        this.direcciones = direcciones;
        this.carrito = carrito;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    
}