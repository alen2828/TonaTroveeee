package models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
        name = "wishlist_productos",
        joinColumns = @JoinColumn(name = "wishlist_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productosDeseados;

    public Wishlist() {
    }

    public Wishlist(Long id, Usuario usuario, List<Producto> productosDeseados) {
        this.id = id;
        this.usuario = usuario;
        this.productosDeseados = productosDeseados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductosDeseados() {
        return productosDeseados;
    }

    public void setProductosDeseados(List<Producto> productosDeseados) {
        this.productosDeseados = productosDeseados;
    }

    
}
